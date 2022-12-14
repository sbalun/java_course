package chapter13b;

import java.io.File;
import java.io.IOException;

public class ExceptionHandling {

    public static void main(String[] args) throws IOException {
        createNewFileRethrow();
    }
    private static void createNewFileRethrow() throws IOException {
        File file = new File("resources/nonexistent.txt");
        file.createNewFile();
    }
}
