import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

class Server{
    public static void main(String args[]) {
        ServerSocket serverSocket=null;
        Socket socket = null;
        DataInputStream in=null;
        DataOutputStream out = null;

        try{
            serverSocket = new ServerSocket(1236);
            socket = serverSocket.accept();
            if(socket.isConnected()){
                System.out.println("Client has Connected!\n");
            }
            in = new DataInputStream(new BufferedInputStream(socket.getInputStream()));
            out = new DataOutputStream(socket.getOutputStream());
        }catch(Exception e){
            e.printStackTrace();
        }

        String line = "";
        while(true){
            try{
                line = in.readUTF();
                if(line.equalsIgnoreCase("over")){
                    try{
                        serverSocket.close();
                        socket.close();
                        in.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    break;
                }
                System.out.println("Message from Client:"+line);
                System.out.print("Reply to Client:");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                String output = br.readLine();
                if(output.equals("over")){
                    try{
                        serverSocket.close();
                        socket.close();
                        in.close();
                    }catch(Exception e){
                        e.printStackTrace();
                    }
                    break;
                }
                out.writeUTF(output);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}