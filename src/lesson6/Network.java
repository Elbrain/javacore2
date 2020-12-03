package lesson6;

import java.io.*;
import java.net.Socket;

public class Network {
    private static final int SERVER_PORT = 8189; // порт для теста
    private static final String SERVER_HOST = "localhost"; // локальный сервер
    private final int port;
    private final String host;
    private DataInputStream dataInputStream; //входящий поток на сервер
    private DataOutputStream dataOutputStream; //исходящий поток
    private Socket socket; //сокет
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public Network() {
        this(SERVER_HOST, SERVER_PORT);
    }

    public Network(String serverHost, int serverPort) {
        this.host = serverHost;
        this.port = serverPort;
    }

    public boolean connect() { // подключение к серверу
        try {
            socket = new Socket(host, port);
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Соеденение не установленно");
            return false;
        }
        return true;
    }

    public void waitMessage() {
        Thread thread = new Thread(() -> {
            try {
                while (true) {
                    String message = dataInputStream.readUTF();

                }
            }
            catch (IOException e){
                e.printStackTrace();
            }

        });
        thread.setDaemon(true);
        thread.start();
    }

    public DataInputStream getDataInputStream() {
        return dataInputStream;
    }

    public DataOutputStream getDataOutputStream() {
        return dataOutputStream;
    }
}
