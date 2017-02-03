package cn.springmvc.action;

import cn.springmvc.bean.Student;
import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractCommandController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * Created by free on 17-2-2.
 */
public class EditStudent extends AbstractCommandController {

    public EditStudent(){
        this.setCommandClass(Student.class);
    }
    protected ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception {
        ModelAndView modelAndView=new ModelAndView();
        Student student=new Student();
        student.setAge(22);
        student.setName("刘光杰");
        student.setBirthday(new Date());
        modelAndView.addObject("stu",student);
        modelAndView.setViewName("/edit.jsp");
        return modelAndView;
    }

}
