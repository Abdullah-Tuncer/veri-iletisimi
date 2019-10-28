package serverclientodev;

import java.io.*;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class Server {
    
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        //Soket oluşturma ve bağlama
        ServerSocket server = new ServerSocket(1755);
        Socket client = server.accept();
        while (true) {
            // yazdığı verileri alma
            InputStreamReader gelen = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader(gelen);

            PrintWriter print = new PrintWriter(client.getOutputStream());

            //veriyi okuma
            String gelenVeri = br.readLine();
            System.out.println("Gelen :"+ gelenVeri);

            System.out.print("Gönder :");
            String gonder = scan.nextLine();

            print.println(gonder);
            print.flush();
        }
    }
    
}
