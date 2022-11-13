<%@ page import="com.spacev.ArchitectFirmBackEnd.entities.Customers" %>
<%@ page errorPage="error_page.jsp" %>


<%

    Customers customers = (Customers) session.getAttribute("current_user");

    if (customers == null) {
        response.sendRedirect("../custo_login.html");
    }

%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Project</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link
            href="https://fonts.googleapis.com/css2?family=Itim&family=Josefin+Sans&family=Poppins&family=Quicksand&display=swap"
            rel="stylesheet">
</head>

<body>
<div>
    <div class="container-fluid bg-dark">
        <div class="row">
            <nav class="navbar navbar-dark bg-secondary p-3">
                <img src="../images/lady.svg" class="rounded float-start d-block" height="100px" width="100px"
                     alt="lady"/>
                <a class="display-5 nav-link text-white" href="custo_dashboard.jsp">Aakar Consultancy</a>
            </nav>
        </div>

        <div class="container bg-info p-2 mt-2">

            <div class="col-12 m-5">
                <h1>Please Fill Project Requirements : -</h1>
            </div>

            <form class="row g-3 text-dark m-5" method="post" action="../add_project">
                <div class="col-md-6">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" id="name" name="name"
                           value="<%=  customers.getFirstName() +" "+ customers.getLastName() %>" disabled>
                </div>

                <div class="col-md-6">
                    <label for="inputEmail" class="form-label">Email</label>
                    <input type="email" class="form-control" id="inputEmail" name="inputEmail"
                           value="<%= customers.getEmail() %>" disabled>
                </div>

                <div class="col-md-6">
                    <label for="inputAddress" class="form-label">Land Address</label>
                    <input type="text" class="form-control" id="inputAddress">
                </div>

                <div class="col-md-6">
                    <label for="inputResAddress" class="form-label">Current Residential Address</label>
                    <input type="text" class="form-control" id="inputResAddress">
                </div>

                <div class="col-md-6">
                    <label for="inputCity" class="form-label">Land City</label>
                    <input type="text" class="form-control" id="inputCity">
                </div>

                <div class="col-md-6">
                    <label for="inputDist" class="form-label">District</label>
                    <input type="text" class="form-control" id="inputDist">
                </div>

                <div class="col-md-6">
                    <label for="inputArea" class="form-label">Land Area</label>
                    <input type="text" class="form-control" id="inputArea">
                </div>

                <div class="form-group col-md-1  mt-auto mb-1">
                    <select class="form-select form-select-sm" name="unit" aria-label=".form-select-sm example">
                        <option value="sq ft">sq ft</option>
                        <option value="sq m">sq m</option>
                        <option value="dismil">dismil</option>
                        <option value="Acre">Acre</option>
                        <option value="Hectare">Hectare</option>
                    </select>
                </div>

                <div class="form-group col-md-5  mt-auto mb-1">
                    <label for="requirement" class="form-label">Requirements</label>
                    <select class="form-select form-select-sm" aria-label=".form-select-sm example" id="requirement"
                            name="requirement">
                        <option value="1 BHK">1 BHK</option>
                        <option value="2 BHK">2 BHK</option>
                        <option value="3 BHK">3 BHK</option>
                    </select>
                </div>

                <div class="col-md-12">
                    <label for="formFile" class="form-label">Upload Document</label>
                    <input class="form-control" type="file" id="formFile" name="document">
                </div>

                <div class="col-md-12">
                    <label for="drawings" class="form-label">Choose Drawings</label>
                    <select class="form-select form-select-md" multiple aria-label=".form-select-lg" id="drawings"
                            name="drawings">
                        <option value="Site Plan">Site Plan</option>
                        <option value="Elevation">Elevation</option>
                        <option value="Landscape">Landscape</option>
                        <option value="Finishing Drawing">Finishing Drawing</option>
                        <option value="Installation Drawings">Installation Drawings</option>
                        <option value="Column Layout">Column Layout</option>
                        <option value="Plinth Beam Layout">Plinth Beam Layout</option>
                        <option value="Lintel Beam Layout">Lintel Beam Layout</option>
                        <option value="Roof Beam and Shuttering Layout">Roof Beam and Shuttering Layout</option>
                        <option value="Roof Slab Layout">Roof Slab Layout</option>
                        <option value="Foundation Plan">Foundation Plan</option>
                    </select>
                </div>

                <div class="col-12 text-end">
                    <small>
                        <a href="https://www.united-bim.com/a-comprehensive-guide-42-types-of-drawings-used-in-building-design/"
                           target="_blank" class="text-white">show details about drawings...
                        </a>
                    </small>
                </div>

                <div class="form-floating">
                        <textarea class="form-control" placeholder="Leave a comment here" id="comment"
                                  name="comment"></textarea>
                    <label for="comment">Other Comments</label>
                </div>

                <div class="col-12 text-center">
                    <button type="submit" class="btn btn-outline-dark">Submit</button>
                </div>
            </form>
        </div>
    </div>
</div>
</body>

</html>