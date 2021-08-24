import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        
        // TODO code application logic here
        final String HOST = "54.237.217.133";
        //final String HOST = "181.130.122.77";
        final int PUERTO = 5000;
        DataInputStream in;
        DataOutputStream out;

        try {
            Socket sc = new Socket(HOST, PUERTO);

            in = new DataInputStream(sc.getInputStream());
            out = new DataOutputStream(sc.getOutputStream());

            //out.writeUTF("5,9,mul");
            out.writeUTF("5,9,sum");
            //out.writeUTF("20,5,div");
            //out.writeUTF("10,9,rest");

            String mensaje = in.readUTF();
            System.out.println(mensaje);

            sc.close();

        } catch (Exception e) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
