/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serverclientodev;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;
import java.util.Scanner;

/**
 *
 * @author Abdullah
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost",1755);
        while(true){
            //okuma
            InputStreamReader isr = new InputStreamReader(client.getInputStream());
            BufferedReader br = new BufferedReader(isr);

            //yazma
            PrintWriter print = new PrintWriter(client.getOutputStream());

            System.out.print("Gönder :");
            Scanner scan =new Scanner(System.in);
            //istek gönderme
            print.println(scan.nextLine());
            print.flush();
            //istek okuma
            System.out.println("Gelen :"+ br.readLine());
        }
    }
}
