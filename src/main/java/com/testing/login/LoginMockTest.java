package com.testing.login;

import com.sun.xml.internal.txw2.output.DumpSerializer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginMockTest")
public class LoginMockTest extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().append("post 方法被调用");
        String user = request.getParameter("user");
        String password = request.getParameter("pwd");
        String result="{";

        if ("roy".equals(user) && "123456".equals(password)) {
            result+="\"msg\":\"恭喜登录成功\",\"code\":\"0\"}";
        }
        else{
            result+="\"msg\":\"用户密码错误\",\"code\":\"1\"}";
        }
        response.getWriter().append(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().append("get 方法被调用");
        String user = request.getParameter("user");
        String password = request.getParameter("pwd");
        String result="{";

        if ("roy".equals(user) && "123456".equals(password)) {
            result+="\"msg\":\"恭喜登录成功\",\"code\":\"0\"}";
        }
        else{
            result+="\"msg\":\"用户密码错误\",\"code\":\"1\"}";
        }
        response.getWriter().append(result);
    }
}
