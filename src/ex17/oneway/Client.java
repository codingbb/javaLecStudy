package ex17.oneway;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {
            //소켓만들고
            Socket socket = new Socket("127.0.0.1", 10000); //11번 라인 소켓과 연결

//            Scanner sc = new Scanner(System.in);
//            String msg = sc.nextLine();

            //버퍼드라이트만들고
            BufferedWriter bw = new BufferedWriter(
                    new OutputStreamWriter(socket.getOutputStream(), "UTF-8")
                    //소켓에 BufferWriter 쓸거고, 그 쓰는건 UTF-8로 할거다
            );

            //쓰고
            bw.write("msg1" + "\n");
            bw.write("msg2" + "\n");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace(); //에러를 자세하게 볼 수 있음
        }
    }
}
