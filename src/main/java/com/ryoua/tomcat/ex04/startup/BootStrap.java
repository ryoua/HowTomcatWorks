package com.ryoua.tomcat.ex04.startup;

import com.ryoua.tomcat.ex04.core.SimpleContainer;
import org.apache.catalina.connector.http.HttpConnector;

/**
 * @Author ryoua Created on 2019-05-05
 */
public final class BootStrap {
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        SimpleContainer container = new SimpleContainer();
        connector.setContainer(container);

        try {
            connector.initialize();
            connector.start();
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
