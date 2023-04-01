package pl.minigames.lotto;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class LottoNumbersGeneratorTest {
    @Test
    public void should_return_six_numbers() {
        //given
        LottoNumbersGenerator lottoNumbersGenerator = new LottoNumbersGenerator();
        int size = 6;

        //when
        lottoNumbersGenerator.generateSixNumbers();

        //then
        assertEquals(size, lottoNumbersGenerator.getSixWinningNumbers().size());
    }

    @Test
    public void should_return_sixWinning_numbers() {
        //given
        LottoNumbersGenerator lottoNumbersGenerator = new LottoNumbersGenerator();
        Set<Integer> numbers = new HashSet<>();

        //when
        for (int i = 1; i < 7; i++) {
            numbers.add(i);
        }
        lottoNumbersGenerator.setSixWinningNumbers(numbers);
        Set<Integer> winningNumbers = lottoNumbersGenerator.getSixWinningNumbers();

        //then
        assertEquals(numbers, winningNumbers);
    }

}