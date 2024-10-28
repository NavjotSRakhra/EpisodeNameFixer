package io.github.navjotsrakhra.cli;

public enum Usage {
    HELP_TEXT("""
            Episode Name Fixer
            Description: The EpisodeNameFixer is a simple tool designed to help you rename episode files in a specific directory to a standardized format: SXXEYY. This format includes the season number (SXX) and episode number (EYY), making it easier to organize and identify your episodes.
            
            Usage: EpisodeNameFixer <directory> <season_number>
                - <directory>: This is the path to the folder where your episode files are located. You can use either a full path (like C:\\TV Shows\\MyShow\\) or a relative path (like ./MyShow/). Ensure that this directory contains the episode files you want to rename.
                - <season_number>: This is the season number of the episodes in the specified directory. For example, if you want to rename the episodes for Season 2, you would enter 2. Please enter just the number, without any extra characters.
            
            Episode Naming Format (SXXEYY):
            
            SXX: This represents the season number.
            For example, if you specify 2, the format will include S02.
            EYY: This represents the episode number within that season.
            For example, if the first episode is being renamed, it will appear as E01, the second as E02, and so on.
            
            Example:
            
            If your episode files are located in C:\\TV Shows\\MyShow\\Season 2 and you want to fix the names for Season 2, you would run:
            
            EpisodeNameFixer "C:\\TV Shows\\MyShow\\Season 2" 2
            This command will rename your files to look like:
            
            S02E01 - Episode Title
            S02E02 - Episode Title
            S02E03 - Episode Title
            And so forth, in order, according to the episode's sequence.
            
            Important Notes:
            
            Ensure that your episode files are named in a consistent manner (like using titles or numbers) so the tool can identify and rename them correctly.
            It's advisable to back up your files before running this tool, just in case something doesn’t go as planned.
            The tool will automatically rename your files in the SXXEYY format, where XX is the season number you provided, and YY is the episode number assigned in order.
            """),
    USAGE("""
            Usage: EpisodeNameFixer <directory> <season_number>
                - <directory>: This is the path to the folder where your episode files are located. You can use either a full path (like C:\\TV Shows\\MyShow\\) or a relative path (like ./MyShow/). Ensure that this directory contains the episode files you want to rename.
                - <season_number>: This is the season number of the episodes in the specified directory. For example, if you want to rename the episodes for Season 2, you would enter 2. Please enter just the number, without any extra characters.
            """)

    ;
    private final String value;

    Usage(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
