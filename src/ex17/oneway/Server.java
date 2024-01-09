package ex17.oneway;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(10000);
            Socket socket = serverSocket.accept(); //리스너 (누가 나한테 통신 요청하는지를 리스닝함)
            System.out.println("클라이언트 연결됨");

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(socket.getInputStream(), "UTF-8")
            );

            while (true) {
                String msg = br.readLine(); //while 돌려서 써라

                if (msg == null) break;

                System.out.println(msg);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
