package com.ryoua.tomcat.ex03.core;

import com.ryoua.tomcat.ex03.connector.http.HttpRequest;
import com.ryoua.tomcat.ex03.connector.http.HttpResponse;

import java.io.IOException;

/**
 * @Author ryoua Created on 2019-05-04
 */
public class StaticResourceProcessor {

    public void process(HttpRequest request, HttpResponse response) {
        try {
            response.sendStaticResource();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

}
