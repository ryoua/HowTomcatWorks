package ch05.valves;

import org.apache.catalina.*;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Enumeration;

/**
 * * @Author: RyouA
 * * @Date: 2020/5/29 - 3:05 下午
 **/
public class HeaderLoggerValve implements Contained, Valve {
    protected Container container;

    @Override
    public Container getContainer() {
        return container;
    }

    @Override
    public void setContainer(Container container) {
        this.container = container;
    }

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void invoke(Request request, Response response, ValveContext context) throws IOException, ServletException {
        context.invokeNext(request, response);
        ServletRequest seq = request.getRequest();
        if (seq instanceof HttpServletRequest) {
            HttpServletRequest httpServletRequest = (HttpServletRequest) seq;
            Enumeration enumeration = httpServletRequest.getHeaderNames();
            while (enumeration.hasMoreElements()) {
                String header = enumeration.nextElement().toString();
                String values = httpServletRequest.getHeader(header);
                System.out.println(header + " : " + values);
            }
        } else {
            System.out.println("No Http Header");
        }
        System.out.println("----------------------------");
    }
}
