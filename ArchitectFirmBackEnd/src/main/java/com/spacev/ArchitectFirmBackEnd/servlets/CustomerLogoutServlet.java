package com.spacev.ArchitectFirmBackEnd.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class CustomerLogoutServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        HttpSession session = request.getSession();

        session.removeAttribute("current_user");

        PrintWriter out = response.getWriter();

        out.println("<h1>Logout SuccessFully</h1>");

       RequestDispatcher dispatcher= request.getRequestDispatcher("custo_login.html");

       dispatcher.include(request,response);
    }
}
