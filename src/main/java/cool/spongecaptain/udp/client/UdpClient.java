package cool.spongecaptain.udp.client;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

public class UdpClient {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds = new DatagramSocket();
        ds.connect(InetAddress.getByName("localhost"), 8333); // 连接指定服务器和端口
        String str = "hello world";
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

        ds.send(packet);

        ds.close();
    }
}
