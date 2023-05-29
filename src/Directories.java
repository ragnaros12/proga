import java.io.File;

public class Directories {
    public static void main(String[] args) {
        printFiles(new File("/Users/artem/IdeaProjects/"));
    }

    public static void printFiles(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    System.out.println("Directory: " + file.getAbsolutePath());
                    printFiles(file);
                } else {
                    System.out.println("File: " + file.getAbsolutePath());
                }
            }
        }
    }

}