package cn.springmvc.handler;

import com.sun.net.httpserver.HttpServer;
import org.springframework.web.util.UrlPathHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by free on 17-2-2.
 * 测试url截取
 */
public class UrlPathSub extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UrlPathHelper urlPathHelper =new UrlPathHelper();
        //System.out.println(req.getServletPath());
        //System.out.println(req.getServletPath());
        //System.out.println(req.getServletPath());
        String path=urlPathHelper.getLookupPathForRequest(req);
        System.out.println(path);
    }
}
