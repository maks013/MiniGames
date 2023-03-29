package pl.minigames.lotto;

import lombok.Getter;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

@Getter
public class LottoNumbersGenerator {
    Set<Integer> sixWinningNumbers = new HashSet<>();

    public void generateSixNumbers() {
        for (int i = 0; i < 6; i++) {
            Random random = new Random();
            int randomNumber = random.nextInt(98) + 1;
            sixWinningNumbers.add(randomNumber);
        }
    }

}
