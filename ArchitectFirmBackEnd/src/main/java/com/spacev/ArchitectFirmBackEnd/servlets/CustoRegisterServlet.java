package com.spacev.ArchitectFirmBackEnd.servlets;

import com.spacev.ArchitectFirmBackEnd.dao.CustomerDao;
import com.spacev.ArchitectFirmBackEnd.entities.Customers;
import com.spacev.ArchitectFirmBackEnd.helper.ConnectionProvider;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class CustoRegisterServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        PrintWriter printWriter = response.getWriter();

        String fName = request.getParameter("first_name");
        String lName = request.getParameter("last_name");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone_no");
        String securityQuestion = request.getParameter("security_questions");
        String answer = request.getParameter("answer");

        Random random = new Random();
        String pass = lName + random.nextInt(100);

        Customers customers = new Customers(fName, lName, email, pass, pass, phone, securityQuestion, answer);
        CustomerDao customerDao = new CustomerDao(ConnectionProvider.getConnection());

        if (customerDao.saveCustomer(customers)) {

            printWriter.println("<h1>Created Account Successfully , Please Login</h1>");
            printWriter.println("<h2>Your Password Is : </h2>");
            printWriter.println("<h2>");
            printWriter.println(pass);
            printWriter.println("</h2>");

            RequestDispatcher dispatcher = request.getRequestDispatcher("custo_login.html");
            dispatcher.include(request, response);

        } else {
            printWriter.println("<h1>Creation Account Failed ! , Please Fill Form Again</h1>");

            RequestDispatcher dispatcher = request.getRequestDispatcher("create_account.html");
            dispatcher.include(request, response);
            printWriter.println("Failed");
        }
    }
}
