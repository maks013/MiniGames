package pl.minigames.lotto;

import lombok.Data;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.util.HashSet;
import java.util.Set;

import static pl.minigames.lotto.LottoConfig.*;
import static pl.minigames.lotto.LottoGameMessages.*;

@Data
class LottoPlayerInput {
    Set<Integer> userInputedNumbers = new HashSet<>();

    @SneakyThrows
    void inputNumbers(BufferedReader br) {
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.printf(LottoGameMessages.INPUT_NUMBER, (i + 1), MAX_QUANTITY_IN_SET);
                Integer number;
                try {
                    number = Integer.parseInt(br.readLine());
                    if (isInRange(number)) {
                        if (userInputedNumbers.contains(number)) {
                            System.out.println(SAME_NUMBER_INPUTED);
                        } else {
                            userInputedNumbers.add(number);
                            break;
                        }
                    } else {
                        System.out.println(QUANTITY_INFO);
                    }
                } catch (Exception e) {
                    System.out.println(INVALID_DATA_INPUTED);
                }
            }
        }
    }

    boolean isInRange(Integer n) {
        return n >= LOWEST_VALUE_OF_RANGE && n <= HIGHEST_VALUE_OF_RANGE;
    }
}
