package org.example;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int port = 9999;
        int threadPoolSize = 64;
        Server server = new Server(threadPoolSize);
        server.start(port);
    }
}
