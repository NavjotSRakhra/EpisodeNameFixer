package io.github.navjotsrakhra.util;

import java.io.File;
import java.util.Comparator;

public class EpisodeNameComparator implements Comparator<File> {
    @Override
    public int compare(File a, File b) {
        String aFileName = a.getName();
        String bFileName = b.getName();

        String[] tokens1 = aFileName.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        String[] tokens2 = bFileName.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

        for (int i = 0; i < Math.min(tokens1.length, tokens2.length); i++) {
            int cmp = compareTokens(tokens1[i], tokens2[i]);
            if (cmp != 0) {
                return cmp;
            }
        }
        return Integer.compare(tokens1.length, tokens2.length);
    }

    private static int compareTokens(String token1, String token2) {
        // Check if both tokens are numeric
        boolean isNum1 = token1.matches("\\d+");
        boolean isNum2 = token2.matches("\\d+");

        if (isNum1 && isNum2) {
            // Both are numbers, compare as integers
            return Integer.compare(Integer.parseInt(token1), Integer.parseInt(token2));
        } else {
            // Compare as strings
            return token1.compareTo(token2);
        }
    }
}
