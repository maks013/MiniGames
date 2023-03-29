package pl.minigames.lotto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.mockito.Mockito.doReturn;

class LottoPlayerInputTest {
    private LottoPlayerInput lottoPlayer;
    private BufferedReader bufferedReader;

    @BeforeEach
    void setUp() {
        lottoPlayer = new LottoPlayerInput();
        bufferedReader = Mockito.mock(BufferedReader.class);
    }

    @Test
    void inputNumbers_withValidNumbers_shouldAddNumbersToSet() throws IOException {
        //given
        Set<Integer> expectedNumbers = new HashSet<>(Arrays.asList(1, 5, 23, 45, 67, 89));
        doReturn("1,5,23,45,67,89").when(bufferedReader).readLine();

        //when
        lottoPlayer.inputNumbers(bufferedReader);

        //then
        Assertions.assertEquals(expectedNumbers, lottoPlayer.getUserInputedNumbers());
    }

    @Test
    void inputNumbers_withInvalidNumbers_shouldThrowException() throws IOException {
        //given
        doReturn("1 5 200 45 67 -10").when(bufferedReader).readLine();

        //when
        Assertions.assertThrows(NumberFormatException.class, () -> lottoPlayer.inputNumbers(bufferedReader));
    }

    @Test
    void isInRange_withValidNumber_shouldReturnTrue() {
        //given
        Integer number = 50;

        //when
        boolean result = lottoPlayer.isInRange(number);

        //then
        Assertions.assertTrue(result);
    }

    @Test
    void isInRange_withNumberLessThan1_shouldReturnFalse() {
        //given
        Integer number = -10;

        //when
        boolean result = lottoPlayer.isInRange(number);

        //then
        Assertions.assertFalse(result);
    }

    @Test
    void isInRange_withNumberGreaterThan99_shouldReturnFalse() {
        //given
        Integer number = 200;

        //when
        boolean result = lottoPlayer.isInRange(number);

        //then
        Assertions.assertFalse(result);
    }
}