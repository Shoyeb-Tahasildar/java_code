import java.io.IOException;
import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class SimpleServer {

    public static void main(String[] args) throws IOException {
        int port = 8080; // You can change the port number if needed

        HttpServer server = HttpServer.create(new InetSocketAddress(port), 0);

        // Create a context for handling requests at "/"
        server.createContext("/", new MyHandler());

        server.start();
        System.out.println("Server started on port " + port);
    }

    static class MyHandler implements HttpHandler {
        @Override
        public void handle(HttpExchange t) throws IOException {
            System.out.println("server controller hit");
            String response = "Hello from the server!";
            t.sendResponseHeaders(200, response.length());
            t.getResponseBody().write(response.getBytes());
            t.getResponseBody().close();
        }
    }
}