package org.example;

import java.util.Arrays;
import java.util.Comparator;

public class MainFunctions {

    public String findMaxOccurrencesOfI(String input) {
        return Arrays.stream(input.split(" "))
                .max(Comparator.comparingInt(this::countOccurrencesOfI))
                .orElse("");
    }

    private int countOccurrencesOfI(String word) {
        return (int) word.chars()
                .filter(c -> c == 'и' || c == 'И')
                .count();
    }

    public int calculateDiagonalSum(int[][] matrix) {
        int size = matrix.length;
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int index = 0; index < size; index++) {
            primaryDiagonalSum += matrix[index][index];
            secondaryDiagonalSum += matrix[index][size - index - 1];
        }
        return Math.max(primaryDiagonalSum, secondaryDiagonalSum);
    }

    public String extractInitialLetters(String input) {
        StringBuilder initialLetters = new StringBuilder();
        for (String word : input.split(" ")) {
            if (!word.isEmpty()) {
                initialLetters.append(Character.toUpperCase(word.charAt(0)));
            }
        }
        return initialLetters.toString();
    }

    public void paramMethod(boolean a) {
        if (a) throw new RuntimeException();
    }
}
