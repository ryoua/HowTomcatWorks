package ch05.valves;

import org.apache.catalina.*;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import java.io.IOException;

/**
 * * @Author: RyouA
 * * @Date: 2020/5/29 - 3:05 下午
 **/
public class ClientIpLoggerValve implements Valve, Contained {
    protected Container container;

    @Override
    public String getInfo() {
        return null;
    }

    @Override
    public void invoke(Request request, Response response, ValveContext context) throws IOException, ServletException {
        context.invokeNext(request, response);
        System.out.println("client ip: ");
        ServletRequest seq = request.getRequest();
        System.out.println(seq.getRemoteAddr());
        System.out.println("---------------------------");
    }

    @Override
    public Container getContainer() {
        return container;
    }

    @Override
    public void setContainer(Container container) {
        this.container = container;
    }
}
