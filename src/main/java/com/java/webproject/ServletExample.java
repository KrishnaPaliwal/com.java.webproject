package com.java.webproject;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class ServletExample extends HttpServlet {

	private static final long serialVersionUID = 1L;

@Override
 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.setContentType("text/plain");
     PrintWriter out = resp.getWriter();
     out.println("This is a GET request!");
 }

 @Override
 protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.setContentType("text/plain");
     PrintWriter out = resp.getWriter();
     out.println("This is a POST request!");
 }

 @Override
 protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     resp.setContentType("text/plain");
     PrintWriter out = resp.getWriter();
     out.println("This is a PUT request!");
 }
}
