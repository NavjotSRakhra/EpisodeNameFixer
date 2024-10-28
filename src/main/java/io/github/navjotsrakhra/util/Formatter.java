package io.github.navjotsrakhra.util;

public class Formatter {
    private final String format;

    public Formatter(){
        format = "%02d";
    }

    public String formatSeasonAndEpisodeString(int season, int episode) {
        return "S" + String.format(format, season) + "E" + String.format(format, episode);
    }
}
