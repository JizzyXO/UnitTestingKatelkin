package second_task;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    public Map<String, Integer> countWordFrequency(String sentence) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = sentence.toLowerCase().split("\\W+");

        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        return wordCount;
    }
}

