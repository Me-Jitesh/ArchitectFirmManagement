package com.spacev.ArchitectFirmBackEnd.dao;


import com.spacev.ArchitectFirmBackEnd.entities.Customers;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CustomerDao {

    private final Connection con;

    public CustomerDao(Connection con) {
        this.con = con;
    }

    public boolean saveCustomer(Customers customers) {


        boolean res = false;
        try {

            String query = "INSERT INTO customers(firstname,lastname,email,password,passwordencrypted,phone,securityquestion,securityanswer) VALUES(?,?,?,?,?,?,?,?)";

            PreparedStatement preparedStatement = this.con.prepareStatement(query);

            preparedStatement.setString(1, customers.getFirstName());
            preparedStatement.setString(2, customers.getLastName());
            preparedStatement.setString(3, customers.getEmail());
            preparedStatement.setString(4, customers.getPassword());
            preparedStatement.setString(5, customers.getPasswordEncrypted());
            preparedStatement.setString(6, customers.getPhone());
            preparedStatement.setString(7, customers.getSecurityQuestion());
            preparedStatement.setString(8, customers.getSecurityAnswer());

            preparedStatement.executeUpdate();
            res = true;

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return res;
    }

    public Customers customerLogin(String email, String pass) {

        Customers customers1 = null;

        try {

            String query = "SELECT * FROM customers WHERE email=? AND password=?";

            PreparedStatement ps = this.con.prepareStatement(query);
            ps.setString(1, email);
            ps.setString(2, pass);
            ResultSet resultSet = ps.executeQuery();

            if (resultSet.next()) {
                customers1 = new Customers();

                customers1.setId(resultSet.getInt("id"));
                customers1.setFirstName(resultSet.getString("firstname"));
                customers1.setLastName(resultSet.getString("lastname"));
                customers1.setEmail(resultSet.getString("email"));
                customers1.setPhone(resultSet.getString("phone"));
            }

        } catch (SQLException throwable) {
            throwable.printStackTrace();
        }
        return customers1;
    }
}
