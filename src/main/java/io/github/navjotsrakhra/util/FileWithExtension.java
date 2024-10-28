package io.github.navjotsrakhra.util;

import java.io.File;
import java.net.URI;

public class FileWithExtension extends File {
    private String fileName;
    private String extension;

    public FileWithExtension(String pathname) {
        super(pathname);
    }

    public FileWithExtension(String parent, String child) {
        super(parent, child);
    }

    public FileWithExtension(File parent, String child) {
        super(parent, child);
    }

    public FileWithExtension(URI uri) {
        super(uri);
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
