<%@ page import="com.spacev.ArchitectFirmBackEnd.entities.Customers" %>
<%@ page errorPage="error_page.jsp" %>

<%

    Customers customers = (Customers) session.getAttribute("current_user");

    if (customers == null) {
        response.sendRedirect("../custo_login.html");
    }

%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Customer Home Page</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Itim&family=Josefin+Sans&family=Poppins&family=Quicksand&display=swap"
          rel="stylesheet">
</head>

<body style="font-family: 'Quicksand',Ubuntu, Cantarell, sans-serif;">
<div class="container-fluid min-vh-100 text-white" style="background-color: #263238">

    <div class="container-fluid navigation bg-info">
        <div class="row">
            <div class="col-md-6 col-sm-6 text-lg-start m-auto">
                <h1 style="font-family: 'Itim', Roboto, Oxygen-Sans, Ubuntu, Cantarell, sans-serif"
                    class="display-4 p-4">Welcome !
                    <%= customers != null ? customers.getFirstName() : "Dear"%>
                </h1>
            </div>

            <div class="col-md-4 col-sm-4 text-center m-auto">
                <a class="btn btn-outline-dark" href="add_project.jsp" role="button">Add Project</a>
                <a class="btn btn-outline-dark ms-3" href="../customer-logout-servlet" role="button">Logout</a>
            </div>

            <div class="col-md-2 col-sm-2 text-end m-auto">
                <img src="../images/woman.png" class="rounded" height="80vh" alt="woman">
            </div>
        </div>
    </div>

    <div class="mt-5 text-center container-fluid text-info">
        <h1> Your Projects List : - </h1>
    </div>

    <div class="container project mt-5 p-3" style="background-color: #37474f">
        <div class="row">
            <div class="col-md-6 col-sm-6 text-md-start text-sm-start">
                <h1>Plan</h1>
            </div>

            <div class="col-md-2 col-sm-2 text-md-end text-sm-end m-auto text-dark">
                <a class="btn btn-outline-secondary pe-lg-4 ps-lg-4 badge-pill btn-block" href="../index.html"
                   role="button">Edit</a>
            </div>

            <div class="col-md-2 col-sm-2 text-md-end text-sm-end m-auto">
                <a class="btn btn-outline-danger" href="../index.html" role="button">Cancel</a>
            </div>

            <div class="col-md-2 col-sm-2 text-md-end text-sm-end m-auto">
                <a class="btn btn-outline-warning" href="../index.html" role="button">Status</a>
            </div>
        </div>
    </div>
</div>
</body>
</html>
