package cn.springmvc.action;

import cn.springmvc.bean.Student;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.validation.BindException;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by free on 17-2-2.
 */
public class SaveStudent extends AbstractCommandController {
    public SaveStudent(){
        this.setCommandClass(Student.class);
    }

    protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        String name =request.getParameter("name");
        System.out.println(name);
        System.out.println(command);
        modelAndView.setViewName("/hello.jsp");

        return modelAndView;
    }

    //注册属性编辑器
    @Override
    protected void initBinder(HttpServletRequest request, ServletRequestDataBinder binder) throws Exception {
        binder.registerCustomEditor(Date.class,new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"),true));
    }

    //值绑定
    @Override
    protected void onBind(HttpServletRequest request, Object command) throws Exception {
        //super.onBind(request, command);
    }

    //字段校验
    @Override
    protected void onBindAndValidate(HttpServletRequest request, Object command, BindException errors) throws Exception {
        //super.onBindAndValidate(request, command, errors);
    }
}
