package pl.minigames.lotto;

import java.util.Set;

import static pl.minigames.lotto.LottoGameMessages.*;

class LottoResult {
    private final LottoHitByThePlayer lottoHitByThePlayer = new LottoHitByThePlayer();

    void getResult(Set<Integer> randomNumbers, Set<Integer> inputedByThePlayer) {
        winOrLose(randomNumbers, inputedByThePlayer);
        returnNumbers(randomNumbers, inputedByThePlayer);
    }

    private void winOrLose(Set<Integer> randomNumbers, Set<Integer> inputedByThePlayer) {
        System.out.println(SEPARATION);
        if (randomNumbers.equals(inputedByThePlayer)) {
            System.out.println(WIN);
        } else {
            System.out.println(LOSE + lottoHitByThePlayer.calculateHits(inputedByThePlayer, randomNumbers));
        }
    }

    private void returnNumbers(Set<Integer> randomNumbers, Set<Integer> inputedByThePlayer) {
        System.out.println(SEPARATION);
        System.out.println(YOUR_NUMBERS + inputedByThePlayer);
        System.out.println(WINNING_NUMBERS + randomNumbers);

    }
}
