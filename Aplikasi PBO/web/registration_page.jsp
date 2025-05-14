<%-- 
    Document   : registration_page
    Created on : May 14, 2025, 2:36:43 PM
    Author     : Fathan Fardian Sanum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Register - ASSISTIFY 2025</title>
    <link rel="stylesheet" href="registration_page.css">
    <link href='https://fonts.googleapis.com/css?family=Space+Grotesk' rel='stylesheet'>
</head>
<body>
    <header>
        <div class="logo">
            <img src="assets/Logo.png" alt="ASSISTIFY Logo">
        </div>
    </header>

    <section class="register-section">
        <div class="register-container">
            <h2>Register</h2>
            <form action="/register" method="POST">
                <label for="username">Username</label>
                <input type="text" id="username" name="username" required>

                <label for="password">Password</label>
                <input type="password" id="password" name="password" required>

                <label for="confirm-password">Confirm Password</label>
                <input type="password" id="confirm-password" name="confirm-password" required>

                <button type="submit">Register</button>
            </form>
            <p class="login-link">Already have an account? <a href="login_page.jsp">Log In</a></p>
        </div>
    </section>

    <footer>
        <p>&copy; 2025 Assistify. All rights reserved.</p>
        <p>Powered by <a href="#">Assistify Technologies</a></p>
    </footer>
</body>
</html>

