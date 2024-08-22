package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileHandler {

    public static void main(String[] args) {

        String inputPath = "/Users/vinayak/Desktop/Siemens/Output_File";

        try {
            fileHandler(inputPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fileHandler(String inputPath) throws IOException {

        File dirPath = new File(inputPath);

        File[] files = dirPath.listFiles(((dir, name) -> name.endsWith(".dat")));

        for (File f: files) {
            System.out.println(f.getAbsoluteFile());
            System.out.println(f.getName());
        }

        //BufferedReader br = new BufferedReader(new FileReader(inputPath));

        //BufferedReader br1 = new BufferedReader(new FileReader(inputPath));

        String word;

        String line;


    }
}
