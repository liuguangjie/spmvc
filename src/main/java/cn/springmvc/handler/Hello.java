package cn.springmvc.handler;

import org.springframework.web.HttpRequestHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by free on 17-2-1.
 */
public class Hello implements Controller/*,HttpRequestHandler */{
    /*public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message","oooxxxx");
        request.getRequestDispatcher("/hello.jsp").forward(request,response);
    }*/

    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("message","你好呀");
        modelAndView.setViewName("/hello.jsp");
        return modelAndView;
    }
}
