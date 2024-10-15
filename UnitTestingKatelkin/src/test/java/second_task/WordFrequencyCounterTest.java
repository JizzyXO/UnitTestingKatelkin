package second_task;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class WordFrequencyCounterTest {
    @Test
    void testSimpleSentence() {
        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> result = counter.countWordFrequency("Hello world hello");
        assertEquals(Map.of("hello", 2, "world", 1), result);
    }

    @Test
    void testWithPunctuation() {
        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> result = counter.countWordFrequency("Hello, world! Hello...");
        assertEquals(Map.of("hello", 2, "world", 1), result);
    }

    @Test
    void testEmptySentence() {
        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> result = counter.countWordFrequency("");
        assertFalse(result.isEmpty());
    }

    @Test
    void testWithDifferentCases() {
        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> result = counter.countWordFrequency("HELLO hello HeLLo");
        assertEquals(Map.of("hello", 3), result);
    }

    @Test
    void testWithMultipleSpaces() {
        WordFrequencyCounter counter = new WordFrequencyCounter();
        Map<String, Integer> result = counter.countWordFrequency("hello   world");
        assertEquals(Map.of("hello", 1, "world", 1), result);
    }
}

