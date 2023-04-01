package pl.minigames;

import pl.minigames.lotto.LottoGame;

public class Main {
    public static void main(String[] args) {
        Game lottoGame = new LottoGame();
        lottoGame.startGame();
    }
}