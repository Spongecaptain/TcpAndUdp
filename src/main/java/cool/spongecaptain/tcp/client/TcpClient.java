package cool.spongecaptain.tcp.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class TcpClient {

    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("localhost", 8333);

        OutputStream outputStream = socket.getOutputStream();

        String str = "hello world";

        outputStream.write((str).getBytes(StandardCharsets.UTF_8));

        outputStream.flush();

        outputStream.close();
    }
}
