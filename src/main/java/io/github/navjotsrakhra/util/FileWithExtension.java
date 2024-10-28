package io.github.navjotsrakhra.util;

import java.io.File;

public class FileWithExtension extends File {
    private String fileName;
    private String extension;

    public FileWithExtension(File file){
        super(file.getAbsolutePath());
    }

    public String getFileName() {
        if (fileName == null) {
            fileName = super.getName().substring(0, super.getName().lastIndexOf('.'));
        }
        return fileName;
    }

    public String getExtension() {
        if (extension == null) {
            extension = super.getName().substring(super.getName().lastIndexOf('.') + 1);
        }
        return extension;
    }
}
