<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isErrorPage="true" %>

<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Itim&family=Josefin+Sans&family=Poppins&family=Quicksand&display=swap"
          rel="stylesheet">
    <title>Error</title>
</head>

<body style="font-family:'Quicksand Light'" class="bg-dark">
<div class="container text-center vh-100 text-white d-flex align-items-center">
    <div class="row text-center">
        <div class="col-sm-12 text-center">
            <img src="../images/error.svg" alt="error" class="img-fluid mb-5">

            <h5 class="display-5 mt-5 fw-light">Oops !! Something Went Wrong ! Please Try Again </h5>

            <br/> <%= exception %>  <br/>

            <a href="../index.html">
                <button class="btn btn-info mt-3 text-white btn-lg">Go To Home</button>
            </a>

        </div>
    </div>
</div>
</body>
</html>
