import java.net.*;

class array_ip{
    public static void main(String args[])throws UnknownHostException{
    	InetAddress ip[]=InetAddress.getAllByName("www.google.com");
    	System.out.println("all ip name are:");
    	for (InetAddress element : ip) {
    		System.out.println(element);
    	}
    }
}