package lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {
    static  Network network = new Network();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws InterruptedException {
        if (!network.connect()) {
            System.out.println("Не удаётся подключиться к серверу.");
        }
        sendMessage();
    }
   static public void sendMessage() throws InterruptedException {
        String message = null;
       while (true) {
           try {
               message = reader.readLine();
           } catch (IOException e) {
               e.printStackTrace();
           }
           if (message.isBlank()) {
               return;
           }
           String finalMessage = message;
           Thread thread = new Thread(() -> {
           try {

               network.getDataOutputStream().writeUTF(finalMessage);
           } catch (IOException e) {
               System.out.println("Неполучается отправить сообщение");
           }

           try {
               System.out.println("Сообщение сервера : " + network.getDataInputStream().readUTF());
           } catch (IOException e) {
               System.out.println("Неполучается отправить сообщение");
           }
           });
           thread.setDaemon(true);
           thread.join();
           thread.start();
       }
       }

}
