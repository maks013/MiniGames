package pl.minigames.lotto;

import lombok.Data;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

import static pl.minigames.lotto.LottoConfig.*;

@Data
public class LottoNumbersGenerator {

    Set<Integer> sixWinningNumbers = new HashSet<>();

    public void generateSixNumbers() {
        Set<Integer> numbers = new Random()
                .ints(LOWEST_VALUE_OF_RANGE, HIGHEST_VALUE_OF_RANGE)
                .distinct()
                .limit(6)
                .boxed()
                .collect(Collectors.toSet());
        sixWinningNumbers.addAll(numbers);
    }
}
