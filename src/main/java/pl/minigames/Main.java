package pl.minigames;

import pl.minigames.lotto.LottoGame;

public class Main {
    public static void main(String[] args) {
        Game lottGame = new LottoGame();
        lottGame.startGame();
    }
}