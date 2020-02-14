import java.net.*;

class PortScanner{
    public static void main(String args[]){
        // int count = 0;
        // for(int i=0;i<65536;i++){
            try {
                Socket s = new Socket("127.0.0.1", 3000);
                System.out.println("Port available 21");
                s.close(); 
            } catch (Exception e) {
                // count++;
                e.printStackTrace();
            }
            // System.out.println(count);
        // }
        // System.out.println(count);
    }
}