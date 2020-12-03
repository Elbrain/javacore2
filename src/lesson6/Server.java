package lesson6;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    private static final int SERVER_PORT = 8189;
    static Network network = new Network();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(SERVER_PORT)) {
            System.out.println("Ожидания подключения");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Соеденение установленно");
            //Scanner scanner = new Scanner(clientSocket.getInputStream());
            DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(clientSocket.getOutputStream());
            while (true) {
                String message = dataInputStream.readUTF();
                System.out.println("Сообщение пользователя : " + message);
                if (message.equals("/exit")) {
                    break;
                }
                Thread thread = new Thread(() -> {
                try {
                    String messageBack = reader.readLine();
                    dataOutputStream.writeUTF(messageBack);
                }
                catch (IOException e) {
                    System.out.println("Неполучается отправить сообщение");
                }
                });
                thread.setDaemon(true);
                thread.join();
                thread.start();
            }


            System.out.println("Сервер остановлен");
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            System.out.println("Порт уже занят");
        }
    }

}
