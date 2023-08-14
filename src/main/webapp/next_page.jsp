<!DOCTYPE html>
<html>
<head>
    <title>Next Page</title>
</head>
<body>
    <h1>Welcome to the Next Page</h1>
    
    <%-- Retrieve the form data using JSP implicit objects --%>
    <% String username = request.getParameter("username"); %>
    <% String password = request.getParameter("password"); %>
    
    <%-- Display the submitted data --%>
    <p>Username: <%= username %></p>
    <p>Password: <%= password %></p>
</body>
</html>
