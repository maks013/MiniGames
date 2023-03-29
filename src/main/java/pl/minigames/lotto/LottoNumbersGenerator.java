package pl.minigames.lotto;

import lombok.Data;
import lombok.Getter;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

@Data
public class LottoNumbersGenerator {
    Set<Integer> sixWinningNumbers = new HashSet<>();

    public void generateSixNumbers() {
        Set<Integer> numbers = new Random()
                .ints(1, 99)
                .distinct()
                .limit(6)
                .boxed()
                .collect(Collectors.toSet());
        sixWinningNumbers.addAll(numbers);
    }

}
