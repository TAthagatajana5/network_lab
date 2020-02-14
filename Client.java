import java.io.*;
import  java.net.*;

class Client{
    public static void main(String args[]) {
        Socket socket = null;
        BufferedReader in=null;
        DataOutputStream out=null;
        try{
            socket = new Socket("127.0.0.1", 1236);
            if(socket.isConnected()){
                System.out.println("Connected to Server");
            }
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new DataOutputStream(socket.getOutputStream());
        }catch(Exception e){
            e.printStackTrace();
        }

        String line = "";
        while(!line.equalsIgnoreCase("over")){
            try{
                line = in.readLine();
                out.writeUTF(line);

            }catch(Exception e){
                e.printStackTrace();
            }
        }

        if(line.equalsIgnoreCase("over")){
            try{
                socket.close();
                in.close();
                out.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }

    }
}