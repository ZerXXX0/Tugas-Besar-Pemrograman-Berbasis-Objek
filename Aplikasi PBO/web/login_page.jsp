<%-- 
    Document   : login_page
    Created on : May 14, 2025, 2:13:47 PM
    Author     : Fathan Fardian Sanum
--%>

<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login - ASSISTIFY 2025</title>
    <link rel="stylesheet" href="login_page.css">
    <link href='https://fonts.googleapis.com/css?family=Space Grotesk' rel='stylesheet'>
</head>
<body>
    <header>
        <div class="logo">
            <img src="assets/Logo.png" alt="ASSISTIFY Logo"> <!-- Logo image -->
        </div>
    </header>

    <section class="login-section">
        <div class="login-container">
            <h2>Log In</h2>
            <form action="/login" method="POST">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>

                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>

                <button type="submit">Log In</button>
            </form>
            <p class="signup-link">Don't have an account? <a href="registration_page.jsp">Click here</a></p>

        </div>
    </section>

    <footer>
        <p>&copy; 2025 Assistify. All rights reserved.</p>
        <p>Powered by <a href="#">Assistify Technologies</a></p>
    </footer>
</body>
</html>