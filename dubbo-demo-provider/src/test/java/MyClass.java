import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.ServerSocketChannel;

/**
 * TODO
 *
 * @author xiehui1956@gmail.com on 2021/8/10 5:46 下午
 * @version 1.0.0
 */
public class MyClass {

    public static void main(String[] args) throws IOException {
        ServerSocketChannel serverSock = ServerSocketChannel.open();
        int portWithOffset = 0;
        InetSocketAddress addr = new InetSocketAddress(portWithOffset);
        int acceptCount = 100;
        serverSock.socket().bind(addr, acceptCount);
        serverSock.configureBlocking(true);

        SocketAddress localAddress = serverSock.getLocalAddress();
        InetSocketAddress socketAddress = (InetSocketAddress) localAddress;
        System.out.println(socketAddress.getPort());
    }
}
