import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class Sockets {
    static Socket s;
    static PrintWriter pw;

    public static void main(String[] args){
        try{
            s = new Socket("api", 8000);
            pw = new PrintWriter(s.getOutputStream());
            pw.write("hello world");
            pw.flush();
            pw.close();
            s.close();
        }catch(UnknownHostException e){
            System.out.println("fail");
            e.printStackTrace();
        }catch (IOException e){
            System.out.println("fail");
            e.printStackTrace();
        }
    }
}
