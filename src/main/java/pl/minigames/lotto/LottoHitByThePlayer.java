package pl.minigames.lotto;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class LottoHitByThePlayer {
    public int calculateHits(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> hitedNumbers = new HashSet<>(set1);
        boolean result = hitedNumbers.retainAll(set2);
        int size = 0;

        if (result) size = hitedNumbers.size();

        return size;
    }
}
