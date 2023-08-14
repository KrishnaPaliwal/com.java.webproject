<!DOCTYPE html>
<html>
<head>
    <title>Form Page</title>
</head>
<body>
    <h1>Welcome to the Form Page</h1>
    
    <form action="/servletexample" method="post">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" required>
        <br>
        
        <label for="password">Password:</label>
        <input type="password" id="password" name="password" required>
        <br>
        
        <button type="submit">Submit</button>
    </form>
</body>
</html>
