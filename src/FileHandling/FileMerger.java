package FileHandling;

import java.io.*;

public class FileMerger {

    public static void main(String[] args) {

        String inputPath = "/Users/vinayak/Desktop/Siemens/Output_File/output.dat";
        String outputPath = "/Users/vinayak/Desktop/Siemens/Output_File/result.dat";

        try {
            File res = fileMerger(new File(inputPath), new File(outputPath));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public static File fileMerger(File f1, File f2) throws IOException {

        //Initially f1 is first input file & f2 is empty output file

        BufferedReader br1 = new BufferedReader(new FileReader(f1));

        BufferedReader br2 = new BufferedReader(new FileReader(f2));


        //merge f1 & f2 to new file and return it to send again  for fileMerger

        File output = new File(f2.getAbsolutePath());

        BufferedWriter bw = new BufferedWriter(new FileWriter(output));

        String word1 = br1.readLine();
        String word2 = br2.readLine();

        while (word1 != null && word2 != null) {

            int b = word1.compareTo(word2);

            if (b <= 0) {
                bw.write(word1);
                bw.newLine();
                word1 = br1.readLine();
            } else {
                bw.write(word2);
                bw.newLine();
                word2 = br2.readLine();
            }

        }

        // read until reader1 exhausts
        while (word1 != null) {
            bw.write(word1);
            bw.newLine();
            word1 = br1.readLine();
        }

        // read until reader2 exhausts
        while (word2 != null) {
            bw.write(word2);
            bw.newLine();
            word2 = br2.readLine();
        }

        return output;

    }
}
