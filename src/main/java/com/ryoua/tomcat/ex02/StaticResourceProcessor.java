package com.ryoua.tomcat.ex02;

import java.io.IOException;

/**
 * @Author ryoua Created on 2019-05-02
 */
public class StaticResourceProcessor {
    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
