package ch03;

import ch03.connector.http.HttpRequest;
import ch03.connector.http.HttpResponse;

import java.io.IOException;

/**
 * * @Author: RyouA
 * * @Date: 2020/5/27 - 11:17 上午
 **/
public class StaticResourceProcessor {
    public void process(HttpRequest request, HttpResponse response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
