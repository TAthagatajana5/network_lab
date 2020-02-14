import java.net.*;

class GetIP2{
    public static void main(String args[]){
        try{
            // InetAddress Ip = InetAddress.getLocalHost();
            // System.out.println("Address:"+ Ip.getHostAddress());

            InetAddress ips[] = InetAddress.getAllByName("moodlebppimt.ddns.net");
            for(InetAddress ip: ips){
                System.out.println("Host Address: "+ ip.getHostAddress());
            }

            // byte address[] = {(byte)192, (byte)168, (byte)1, (byte)4}; 

            // InetAddress inetAddress = InetAddress.getByAddress(address);
            // System.out.println("Ping request to:"+ inetAddress);
            // String msg = inetAddress.isReachable(5000) ? "Host is Reachable" : "Host is unReacheable";
            // System.out.println(msg);
        } catch(Exception e){
            e.getMessage();
        }
    }
}