package ex17.half;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.Charset;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(20000);
            Socket socket = serverSocket.accept();
            //소켓 연결 완료됨

            //버퍼 만들기 (received)
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream())
            );

            String requestMsg = br.readLine();
            System.out.println("클라이언트로부터 받은 메시지 : " + requestMsg);

            //버퍼 만들기 (send)
            PrintWriter pw = new PrintWriter(socket.getOutputStream(), true, Charset.forName("UTF-8"));

            //프로토콜. 마치 아스키 코드처럼 1을 받으면 영화라고 출력
            //서버 입장에선 클라이언트한테 받는 responseMsg
            if (requestMsg.equals("1")) {
                pw.println("영화");
            } else if (requestMsg.equals("2")) {
                pw.println("드라마");
            } else {
                pw.println("프로토콜을 확인하세요 : 1은 영화, 2는 드라마");
            }



            //역슬래시를 몇 번 날릴지 모르기때문에 원랜 while을 돌려야함. 지금은 생략


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
