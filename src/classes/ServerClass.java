/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ServerClass {
     private ServerSocket serverSocket;
     private Socket socket;
     public final int portNo = 1234;
     public void startServer() throws IOException{
         serverSocket = new ServerSocket(portNo);
         socket = serverSocket.accept();
         new ClientHandler(socket,"User-1").start();
     }
     public static void main(String[] args) throws IOException{
         new ServerClass().startServer();
     }
}
