package com.spacev.ArchitectFirmBackEnd.servlets;

import com.spacev.ArchitectFirmBackEnd.dao.CustomerDao;
import com.spacev.ArchitectFirmBackEnd.entities.Customers;
import com.spacev.ArchitectFirmBackEnd.helper.ConnectionProvider;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CustoLoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String mail = request.getParameter("username");
        String pass = request.getParameter("password");

        CustomerDao customerDao = new CustomerDao(ConnectionProvider.getConnection());

        Customers customers = customerDao.customerLogin(mail, pass);

        PrintWriter printWriter = response.getWriter();

        if (customers != null) {
            HttpSession httpSession = request.getSession();
            httpSession.setAttribute("current_user", customers);
            response.sendRedirect("dynamicpages/custo_dashboard.jsp");
        } else {
            RequestDispatcher dispatcher = request.getRequestDispatcher("custo_login.html");
            printWriter.println("<h1>Wrong Email Or Password  ! Please Try Again </h1>");
            dispatcher.include(request, response);
        }

    }
}
