package ex17.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            //클라이언트에 소켓이 생겼으니, 서버와 소켓과 클라이언트 소켓이 연결되었겠구나
            //포터번호가 20000이니, 서버의 소켓에 연결한게 맞지!
            Socket socket = new Socket("localhost", 20000);

            //고객은 처음에 쓸거니까 PrintWriter를 먼저 단다
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);

            //클라이언트 입장에선 request 메세지
            pw.println("1");

            //이제 읽어야겠지? 응답한거 답하려고 버퍼드리더 3handshack?
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String responseMsg = br.readLine();
            System.out.println("서버로 부터 받은 메시지 : " + responseMsg);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
