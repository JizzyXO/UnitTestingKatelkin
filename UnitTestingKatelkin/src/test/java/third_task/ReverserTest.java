package third_task;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ReverserTest {
    @Test
    void testReverseNormalList() {
        Reverser reverser = new Reverser();
        List<Integer> result = reverser.reverseList(List.of(1, 2, 3, 4, 5));
        assertEquals(List.of(5, 4, 3, 2, 1), result);
    }

    @Test
    void testReverseEmptyList() {
        Reverser reverser = new Reverser();
        List<Integer> result = reverser.reverseList(List.of());
        assertTrue(result.isEmpty());
    }

    @Test
    void testReverseSingleElementList() {
        Reverser reverser = new Reverser();
        List<Integer> result = reverser.reverseList(List.of(1));
        assertEquals(List.of(1), result);
    }

    @Test
    void testReverseDuplicates() {
        Reverser reverser = new Reverser();
        List<Integer> result = reverser.reverseList(List.of(1, 2, 3, 2));
        assertEquals(List.of(3, 2, 3, 1), result);
    }

    @Test
    void testReverseNegativeNumbers() {
        Reverser reverser = new Reverser();
        List<Integer> result = reverser.reverseList(List.of(-1, -2, -3));
        assertEquals(List.of(-3, -2, -1), result);
    }
}
