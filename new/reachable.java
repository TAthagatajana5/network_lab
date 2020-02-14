import java.net.*;

class reachable{
    public static void main(String args[])throws Exception{
    		InetAddress inet;
    		inet=InetAddress.getByAddress(new byte[]{(byte)216,(byte)58,(byte)221,(byte)36});
    		System.out.println("sending ping request to"+inet);
    		System.out.println(inet.isReachable(5000)?"Host reachable":"Host is not reachable");
    }

}