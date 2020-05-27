package ch03.startup;

import ch03.connector.http.HttpConnector;

/**
 * * @Author: RyouA
 * * @Date: 2020/5/27 - 9:28 上午
 **/
public class Bootstrap {
    public static void main(String[] args) {
        HttpConnector connector = new HttpConnector();
        connector.start();
    }
}
