package com.ryoua.tomcat.ex03;

import com.ryoua.tomcat.ex03.connector.http.HttpConnector;

/**
 * @Author ryoua Created on 2019-05-04
 */
public final class BootStrap {
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        connector.start();
    }
}
