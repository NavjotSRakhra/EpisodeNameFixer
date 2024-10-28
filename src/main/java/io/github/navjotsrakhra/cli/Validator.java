package io.github.navjotsrakhra.cli;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class Validator {
    public static void validateArguments(String[] args) throws Exception {
        List<Exception> exceptionsThrown = new ArrayList<>();

        if (args.length != 2) {
            System.out.println(Usage.HELP_TEXT.getValue());
            throw new Exception("You did not enter 2 arguements");
        }

        try {
            validateFileIsADirectory(new File(args[0]));
        } catch (Exception e) {
            exceptionsThrown.add(e);
        }
        try {
            validateIsIntegral(args[1]);
        } catch (Exception e) {
            exceptionsThrown.add(e);
        }

        if (!exceptionsThrown.isEmpty()) {
            StringBuilder finalMessage = new StringBuilder();
            for (Exception exception : exceptionsThrown) {
                finalMessage.append(exception.getMessage());
                finalMessage.append("\n");
            }
            System.out.println(finalMessage);
            throw new Exception(finalMessage.toString());
        }
    }

    private static void validateFileIsADirectory(File file) throws Exception {
        if (!file.exists()) {
            System.out.println(file.getAbsolutePath() + " does not exist");
            throw new FileNotFoundException(file.getAbsolutePath());
        }
        if (!file.isDirectory()) {
            System.out.println(file.getAbsolutePath() + " is not a directory");
            throw new Exception("File is not a directory");
        }
    }

    private static void validateIsIntegral(String integer) throws Exception {
        if (!integer.matches("[0-9]+")) {
            System.out.println(integer + " is not a number");
            throw new Exception(integer + " is not a number");
        }
    }
}
