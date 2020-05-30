package ch05.core;

import org.apache.catalina.Pipeline;
import org.apache.catalina.Request;
import org.apache.catalina.Response;
import org.apache.catalina.Valve;

import javax.servlet.ServletException;
import java.io.IOException;

/**
 * * @Author: RyouA
 * * @Date: 2020/5/29 - 3:30 下午
 **/
public class SimplePipeline implements Pipeline {
    @Override
    public Valve getBasic() {
        return null;
    }

    @Override
    public void setBasic(Valve valve) {

    }

    @Override
    public void addValve(Valve valve) {

    }

    @Override
    public Valve[] getValves() {
        return new Valve[0];
    }

    @Override
    public void invoke(Request request, Response response) throws IOException, ServletException {

    }

    @Override
    public void removeValve(Valve valve) {

    }
}
