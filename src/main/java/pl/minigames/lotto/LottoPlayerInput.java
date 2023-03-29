package pl.minigames.lotto;

import lombok.Getter;
import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.util.HashSet;
import java.util.Set;

@Getter
public class LottoPlayerInput {
    public static final int LOWEST_VALUE_OF_RANGE = 1;
    public static final int HIGHEST_VALUE_OF_RANGE = 99;
    Set<Integer> userInputedNumbers = new HashSet<>();

    @SneakyThrows
    public void inputNumbers(BufferedReader br) {
        for (int i = 0; i < 6; i++) {
            while (true) {
                System.out.print("Podaj liczbę: " + (i + 1) + "/" + "6" + ": ");
                Integer number = Integer.parseInt(br.readLine());
                if (isInRange(number)) {
                    userInputedNumbers.add(number);
                    break;
                } else {
                    System.out.println("Liczby muszą być z zakresu <1,99>");
                }
            }
        }
    }

    public boolean isInRange(Integer n) {
        return n >= LOWEST_VALUE_OF_RANGE && n >= HIGHEST_VALUE_OF_RANGE;
    }
}
