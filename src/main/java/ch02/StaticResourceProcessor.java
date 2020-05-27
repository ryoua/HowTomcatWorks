package ch02;


import ch01.Request;
import ch01.Response;

/**
 * * @Author: RyouA
 * * @Date: 2020/5/26 - 5:00 下午
 **/
public class StaticResourceProcessor {
    public void process(Request request, Response response) {
        try {
            response.sendStaticResource();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
