package pl.minigames.lotto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


class LottoPlayerInputTest {

    private final LottoPlayerInput lottoPlayerInput = new LottoPlayerInput();

    @Test
    void should_add_validNumbers_to_set() {
        //given
        String input = "1\n2\n3\n4\n5\n6\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        BufferedReader br = new BufferedReader(new InputStreamReader(in));

        //when
        Set<Integer> playerInputedSixNumbers = lottoPlayerInput.inputNumbers(br);
        Set<Integer> expectedNumbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        //then
        assertEquals(expectedNumbers, playerInputedSixNumbers);
    }

    @Test
    void should_be_in_range() {
        assertTrue(lottoPlayerInput.isInRange(1));
        assertTrue(lottoPlayerInput.isInRange(49));
        assertFalse(lottoPlayerInput.isInRange(0));
        assertFalse(lottoPlayerInput.isInRange(100));
    }
}