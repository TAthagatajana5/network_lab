import java.io.*;
import java.net.*;

class server{
    public static void main(String[] args) {
        DataInputStream in=null;
        ServerSocket s=null;
        Socket ckt=null;
        try {
            // ServerSocket s =new ServerSocket(1236);
            s=new ServerSocket(1236);
            System.out.println("waiting for clint");
            ckt=s.accept();
            System.out.println("client has connected! \n");
            in=new DataInputStream(new BufferedInputStream(ckt.getInputStream()));
            String line="";
            while (!line.equals("over")) {
                try {
                    line=in.readUTF();
                    System.out.println(line);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            try {
                in.close();
                s.close();
                ckt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }  
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}