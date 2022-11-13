package com.spacev.ArchitectFirmBackEnd.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionProvider {

    private static Connection con;

    public static Connection getConnection() {

        try {
            if (con == null) {
                Class.forName(VendorDetails.driverName);

                con = DriverManager.getConnection(VendorDetails.url, VendorDetails.username, VendorDetails.password);
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return con;
    }
}
