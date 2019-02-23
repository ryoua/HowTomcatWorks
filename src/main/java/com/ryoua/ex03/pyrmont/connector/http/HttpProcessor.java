package com.ryoua.ex03.pyrmont.connector.http;



import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class HttpProcessor {

    public HttpProcessor(HttpConnector connector) {
        this.connector = connector;
    }

    HttpRequest request = null;
    HttpResponse response = null;
    HttpRequestLine requestLine = new HttpRequestLine();
    HttpConnector connector = null;

    public void process(Socket socket) {
        SocketInputStream input = null;
        OutputStream output = null;

        try {
            input = new SocketInputStream(socket.getInputStream(), 2048);
            output = socket.getOutputStream();

            request = new HttpRequest(input);

            response = new HttpResponse(output);
            response.setRequest(request);

            response.setHeader("Server", "Pyrmont Servlet Container");

            parseRequest(input, output);
            parseHeader(input);

            if ()
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void parseRequest(SocketInputStream input, OutputStream output) {

    }
}
