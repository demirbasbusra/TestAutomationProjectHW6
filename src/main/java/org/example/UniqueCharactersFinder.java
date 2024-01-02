package org.example;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersFinder {

    public static Set<Character> findUniqueCharacters(String[] texts, String[] targetWords) {
        Set<Character> uniqueCharacters = new HashSet<>();

        for (String text : texts) {
            String[] words = text.split("\\s+");

            for (String word : words) {
                if (containsTargetWord(word, targetWords)) {
                    if (hasRepeatedChars(word)) {
                        for (char c : word.toCharArray()) {
                            uniqueCharacters.add(c);
                        }

                        if (uniqueCharacters.size() >= 2) {
                            return uniqueCharacters;
                        }
                    }
                }
            }
        }
        return new HashSet<>();
    }

    private static boolean containsTargetWord(String word, String[] targetWords) {
        for (String targetWord : targetWords) {
            if (word.equals(targetWord)) {
                return true;
            }
        }
        return false;
    }

    private static boolean hasRepeatedChars(String word) {
        Set<Character> charSet = new HashSet<>();

        for (char c : word.toCharArray()) {
            if (!charSet.add(c)) {
                return false; // Character repeats
            }
        }

        return true; // All characters are unique
    }

}
