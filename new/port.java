import java.net.*;

class soket1{
    public static void main(String[] args) {
        int count=0;
        for(int i=0;i<65532;i++){
            try {
                Socket s=new Socket("127.0.0.1",i);
                System.out.println(i+"th port in use");
                s.close();
            } catch (Exception e) {
                count++;
            }
        }
        System.out.println(count);
    }
   
}