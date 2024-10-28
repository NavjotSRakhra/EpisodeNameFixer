package io.github.navjotsrakhra;

import io.github.navjotsrakhra.cli.Validator;
import io.github.navjotsrakhra.util.EpisodeNameComparator;
import io.github.navjotsrakhra.util.FileNameAppender;
import io.github.navjotsrakhra.util.FileWithExtension;
import io.github.navjotsrakhra.util.Formatter;

import java.io.File;
import java.util.Arrays;
import java.util.Objects;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Exception {
        Validator.validateArguments(args);

        File seasonDir = new File(args[0]);
        int seasonNumber = Integer.parseInt(args[1]);
        Formatter formatter = new Formatter();
        int episodeNumber = 1;

        FileWithExtension[] files = Arrays.stream(Objects.requireNonNull(seasonDir.listFiles())).sorted(new EpisodeNameComparator()).toArray(FileWithExtension[]::new);
        for (FileWithExtension file : files) {
            String seasonAndEpisodeString = formatter.formatSeasonAndEpisodeString(seasonNumber, episodeNumber);
            episodeNumber += 1;

            String newFileName = FileNameAppender.appendToFileName(file, seasonAndEpisodeString);
            String oldFileName = file.getAbsolutePath();

            if (file.renameTo(new File(oldFileName))) {
                // Rename successful
                System.out.println("Renaming " + oldFileName + " to " + newFileName + " was successful");
            } else {
                System.out.println("Renaming " + oldFileName + " to " + newFileName + " failed");
            }
        }
    }
}
