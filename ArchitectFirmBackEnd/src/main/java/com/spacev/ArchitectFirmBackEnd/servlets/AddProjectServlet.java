package com.spacev.ArchitectFirmBackEnd.servlets;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class AddProjectServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Name = request.getParameter("name");
        String inputEmail = request.getParameter("inputEmail");
        System.out.println("Name"+Name);
        System.out.println("Name"+inputEmail);

        response.sendRedirect("dynamicpages/custo_dashboard.jsp");
    }
}
