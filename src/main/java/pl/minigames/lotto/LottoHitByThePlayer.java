package pl.minigames.lotto;

import java.util.HashSet;
import java.util.Set;

class LottoHitByThePlayer {
    int calculateHits(Set<Integer> inputedByThePlayer, Set<Integer> randomNumbers) {
        Set<Integer> hitedNumbers = new HashSet<>(inputedByThePlayer);
        return hitedNumbers.retainAll(randomNumbers) ? hitedNumbers.size() : 0;
    }
}
