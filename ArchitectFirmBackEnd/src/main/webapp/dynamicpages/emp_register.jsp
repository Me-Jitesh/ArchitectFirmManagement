<%@ page import="java.sql.SQLException" %>
<%@ page import="com.spacev.ArchitectFirmBackEnd.helper.ConnectionProvider" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Connection con = ConnectionProvider.getConnection();

    try {
        Statement statement = con.createStatement();
        statement.executeUpdate("Insert Into employee values (null , 'Jst','jst@gmail.com','jitu')");
    } catch (SQLException throwable) {
        throwable.printStackTrace();
    }

%>

<%= con %>

</body>
</html>
