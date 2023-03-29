package pl.minigames.lotto;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LottoHitByThePlayerTest {

    @Test
    void calculateHits_withNoHits_shouldReturnZero() {
        // given
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4, 5, 6));
        LottoHitByThePlayer lottoHitByThePlayer = new LottoHitByThePlayer();

        // when
        int hits = lottoHitByThePlayer.calculateHits(set1, set2);

        // then
        Assertions.assertEquals(0, hits);
    }

    @Test
    void calculateHits_withSomeHits_shouldReturnNumberOfHits() {
        // given
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set4 = new HashSet<>(Arrays.asList(2, 3, 4));
        LottoHitByThePlayer lottoHitByThePlayer2 = new LottoHitByThePlayer();

        // when
        int hits = lottoHitByThePlayer2.calculateHits(set3, set4);

        // then
        Assertions.assertEquals(2, hits);
    }
}
