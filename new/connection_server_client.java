import java.io.*;
import java.net.*;

class client{
    public static void main(String[] args) {
        BufferedReader in=null;
        DataInputStream in1=null;
        DataOutputStream out=null;
        Socket s=null;
        try {
            // ServerSocket s =new ServerSocket(1236);
            s=new Socket("192.168.4.105",1236);
            System.out.println("server has connected! \n");
            in=new BufferedReader(new InputStreamReader(System.in));
            in1=new DataInputStream(new BufferedInputStream(s.getInputStream()));
            out=new DataOutputStream(s.getOutputStream());
            
            // Socket ckt=s.accept();
            // PrintWriter out =new PrintWriter(ckt.getOutputStream(),true);
            // System.out.println("sending data:"+data);
            // out.print(data);
            // out.close();
            // ckt.close();
            // s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String line=" ";
        while (!line.equals("over")) {
            try {
                line=in.readLine();
                out.writeUTF(line);
                String msg=in1.readUTF();
                System.out.println(msg);
                if(msg.equals("over")){
                    System.out.println("server close the connection");
                    System.out.println("good bye");
                    try {
                        in.close();
                        out.close();
                        s.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                    
                }
                 else {
                    continue;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}