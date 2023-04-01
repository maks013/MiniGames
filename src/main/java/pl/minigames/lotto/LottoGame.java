package pl.minigames.lotto;

import pl.minigames.Game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static pl.minigames.lotto.LottoGameMessages.NAME_OF_GAME;

public class LottoGame implements Game {
    private final LottoPlayerInput player = new LottoPlayerInput();
    private final LottoNumbersGenerator lottoNumbersGenerator = new LottoNumbersGenerator();
    private final LottoResult lottoResult = new LottoResult();

    @Override
    public void startGame() {
        System.out.println(NAME_OF_GAME);
        player.inputNumbers(new BufferedReader(new InputStreamReader(System.in)));
        lottoNumbersGenerator.generateSixNumbers();
        lottoResult.getResult(lottoNumbersGenerator.getSixWinningNumbers(),player.getUserInputedNumbers());
    }
}
