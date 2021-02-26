package cool.spongecaptain.tcp.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8333);


        while (true){

            Socket socket = serverSocket.accept();

            InputStream inputStream = socket.getInputStream();

            byte[] bytes = new byte[128];
            inputStream.read(bytes);

            System.out.println(new String(bytes));
        }
    }
}
