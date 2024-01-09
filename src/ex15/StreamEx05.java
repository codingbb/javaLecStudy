package ex15;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class StreamEx05 {
    public static void main(String[] args) {
        try {
            //BufferedReader br = new BufferedReader(new FileReader("D:\\workspace\\java_lec\\study2\\out\\production\\study2\\ex15\\hello.txt"));
            BufferedReader br = new BufferedReader(new FileReader("src\\ex15\\hello.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));
            bw.write("안녕\n");
            bw.flush();

            String line = br.readLine();
            System.out.println(line);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
