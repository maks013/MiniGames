package pl.minigames.lotto;

import pl.minigames.Game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Set;

import static pl.minigames.lotto.LottoGameMessages.NAME_OF_GAME;

public class LottoGame implements Game {
    private final LottoPlayerInput player = new LottoPlayerInput();
    private final LottoNumbersGenerator lottoNumbersGenerator = new LottoNumbersGenerator();
    private final LottoResult lottoResult = new LottoResult();

    @Override
    public void startGame() {
        System.out.println(NAME_OF_GAME);
        Set<Integer> playerInputedSixNumbers = player.inputNumbers(new BufferedReader(new InputStreamReader(System.in)));
        lottoNumbersGenerator.generateSixNumbers();
        Set<Integer> randomSixNumbers = lottoNumbersGenerator.getSixWinningNumbers();
        lottoResult.getResult(randomSixNumbers, playerInputedSixNumbers);
    }
}
