import java.net.*;

class net{
    public static void main(String args[])throws UnknownHostException{
        InetAddress ip1=InetAddress.getLocalHost();
        System.out.println(ip1.getHostAddress());
    }
}