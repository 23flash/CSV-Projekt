import java.io.*;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<String> File = readFile("datalog_20230418_143118.csv");
        /*
        for (int i = 0; i < File.size() ; i++) {
            System.out.println(File.get(i));
        }

         */
        System.out.println(File.get(0));



    }
    public static ArrayList<String> readFile(String FileName) throws IOException {
        ArrayList<String> builder = new ArrayList<>();


        File file = new File(FileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        int n = 0;
        br.lines().forEach(line -> {builder.add(line);});


        return builder;

    }
}



