package com.testing.login;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginMock")
public class LoginMock extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //后端处理的时候，请求和返回编码都设置为utf-8
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //        设置返回头content-type的格式,以及编码为utf-8
        response.setContentType("text/html;charset=utf-8");
        //login功能
        //从请求的参数中获取user和pwd
        String loginName=request.getParameter("user");
        String password=request.getParameter("pwd");
        System.out.println("请求用户名是"+loginName+"请求密码是"+password);
        String result="{";
        if("Roy".equals(loginName)&&password.equals("123456")){
            result+="\"msg\":\"恭喜登录成功\",\"code\":\"0\"}";
        }
        else{
            result+="\"msg\":\"不好意思用户密码错误\",\"code\":\"1\"}";
        }
        response.getWriter().append(result);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //后端处理的时候，请求和返回编码都设置为utf-8
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        //        设置返回头content-type的格式,以及编码为utf-8
        response.setContentType("text/html;charset=utf-8");

        String loginName=request.getParameter("user");
        String password=request.getParameter("pwd");
        System.out.println("请求用户名是"+loginName+"请求密码是"+password);
        String result="{";
        if("Roy".equals(loginName)&&"123456".equals(password)){
            result+="\"msg\":\"恭喜登录成功\",\"code\":\"0\"}";
        }
        else{
            result+="\"msg\":\"不好意思用户密码错误\",\"code\":\"1\"}";
        }
        response.getWriter().append(result);
        response.getWriter().append("get方法被调用了");
    }
}
