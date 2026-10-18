package dlogistic.loaders;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class JsonFilesPathLoader {

    public static List<File> getJsonFiles(String directoryPath) {

        List<File> jsonFiles = new ArrayList<>();

        File directory = new File(directoryPath);

        if (!directory.exists()) {
            throw new RuntimeException(
                    "Directory does not exist: " + directoryPath);
        }

        if (!directory.isDirectory()) {
            throw new RuntimeException(
                    "Provided path is not a directory: " + directoryPath);
        }

        File[] files = directory.listFiles();

        if (files == null) {
            return jsonFiles;
        }

        for (File file : files) {
            if (file.isFile()
                    && file.getName().toLowerCase().endsWith(".json")) {

                jsonFiles.add(file);
            }
        }

        return jsonFiles;
    }
}