package pl.minigames.lotto;

import lombok.Data;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.util.HashSet;
import java.util.Set;

@Data
public class LottoPlayerInput {
    public static final int LOWEST_VALUE_OF_RANGE = 1;
    public static final int HIGHEST_VALUE_OF_RANGE = 99;
    Set<Integer> userInputedNumbers = new HashSet<>();

    @SneakyThrows
    public void inputNumbers(BufferedReader br) {
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print("Podaj liczbę: " + (i + 1) + "/" + "6" + ": ");
                String input = br.readLine();
                String[] inputNumbers = input.split(",");

                for (String inputNumber : inputNumbers) {
                    Integer number = Integer.parseInt(inputNumber.trim());
                    if (isInRange(number)) {
                        userInputedNumbers.add(number);
                    } else {
                        System.out.println("Liczby muszą być z zakresu <1,99>");
                    }
                }
                break;
            }
        }
    }

    public boolean isInRange(Integer n) {
        return n >= LOWEST_VALUE_OF_RANGE && n <= HIGHEST_VALUE_OF_RANGE;
    }
}
