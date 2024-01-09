package ex15;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class StreamEx02 {
    public static void main(String[] args) {
        InputStreamReader ir = new InputStreamReader(System.in);
        char[] ch = new char[4];

        try {
            ir.read(ch);    //보조스트림으로부터 읽는다는 말
                            //ir은 키보드에 연결되어 있음.
                            //이 객체는 ch라는 보조스트림으로 부터 데이터를 읽겠다

            for (char c : ch) {
                System.out.println(c+ " ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
