package io.github.navjotsrakhra.util;

public class FileNameAppender {

    public static String appendToFileName(final FileWithExtension file, final String toAppend) {
        return file.getParentFile().getAbsolutePath() + file.getFileName() + " " + toAppend + file.getExtension();
    }

}
