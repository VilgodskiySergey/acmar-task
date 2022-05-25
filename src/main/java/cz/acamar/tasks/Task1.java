package cz.acamar.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    /**
     * Task 1. Length of the last word.
     * <p>
     * Given a string s consisting of some words separated by some number of spaces,
     * return the length of the last word in the string.
     * <p>
     * A word is a maximal substring consisting of non-space characters only.
     * <p>
     * Example input: "Hello World"
     * Expected output: 5
     *
     * @param str - a string s consisting of some words separated by some number of spaces.
     * @return - the length of the last word in the string.
     */
    public int lengthOfLastWord(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        final List<String> words = Arrays.stream(str.split(" "))
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());

        return words.get(words.size() - 1).length();
    }
}
