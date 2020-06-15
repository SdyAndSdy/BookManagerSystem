package com.hq.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 一个类要想去处理请求和响应：必须继承HttpServlet
 * 重写service方法
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	     req.setCharacterEncoding("utf-8");
		//获取登录的请求参数
		String name = req.getParameter("userName");
		String password = req.getParameter("password");
		System.out.println("name:"+name);
		System.out.println("password:"+password);
		
	}

}
