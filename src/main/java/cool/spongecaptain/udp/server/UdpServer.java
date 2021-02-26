package cool.spongecaptain.udp.server;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.nio.charset.StandardCharsets;

public class UdpServer {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket(8333); // 监听指定端口，可以与 TCP 重复，互不影响

        while(true){

            byte[] bytes = new byte[1024];

            DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

            ds.receive(packet);

            String str = new String(packet.getData(), packet.getOffset(), packet.getLength(), StandardCharsets.UTF_8);

            System.out.println(str);
        }
    }
}
