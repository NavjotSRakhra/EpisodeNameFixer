package io.github.navjotsrakhra.util;

import java.io.File;

public class FileNameAppender {

    public static String appendToFileName(final FileWithExtension file, final String toAppend) {
        return file.getParentFile().getAbsolutePath() + File.separator + file.getFileName() + " " + toAppend + "." + file.getExtension();
    }

}
