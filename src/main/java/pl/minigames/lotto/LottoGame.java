package pl.minigames.lotto;

import pl.minigames.Game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static pl.minigames.lotto.LottoGameMessages.NAME_OF_GAME;

public class LottoGame implements Game {
    LottoPlayerInput player = new LottoPlayerInput();
    LottoNumbersGenerator lottoNumbersGenerator = new LottoNumbersGenerator();

    @Override
    public void startGame() {
        System.out.println(NAME_OF_GAME);
        player.inputNumbers(new BufferedReader(new InputStreamReader(System.in)));
        lottoNumbersGenerator.generateSixNumbers();
        System.out.println(player.getUserInputedNumbers());
        System.out.println(lottoNumbersGenerator.getSixWinningNumbers());
    }
}
