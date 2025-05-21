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
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link href='https://fonts.googleapis.com/css?family=Space+Grotesk' rel='stylesheet'>
    <link rel="stylesheet" href="registration_page.css">
</head>
<body>
    <header>
        <div class="d-flex justify-content-between align-items-center">
            <a href="index.jsp">
                <img src="assets/Logo.png" alt="ASSISTIFY Logo" class="img-fluid" style="max-width: 150px;"> <!-- Logo image -->
            </a>
        </div>
    </header>

    <section class="register-section d-flex justify-content-center align-items-center">
        <div class="register-container text-white p-5 rounded shadow-lg" style="width: 500px;">
            <h2 class="text-center mb-4">Register</h2>
            <form action="/register" method="POST">
                <div class="mb-3">
                    <label for="username" class="form-label">Username</label>
                    <input type="text" class="form-control" id="username" name="username" required>
                </div>

                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" id="password" name="password" required>
                </div>

                <div class="mb-3">
                    <label for="confirm-password" class="form-label">Confirm Password</label>
                    <input type="password" class="form-control" id="confirm-password" name="confirm-password" required>
                </div>

                <button type="submit" class="btn btn-light mt-5 w-100 py-3">Register</button>
            </form>

            <p class="mt-1 pt-4 text-center">
                Already have an account? <a href="login_page.jsp" class="text-white text-decoration-none klik">Log In</a>
            </p>
        </div>
    </section>

    <footer class="text-white text-center py-3">
        <p>&copy; 2025 Assistify. All rights reserved.</p>
        <p>Powered by <a href="#" class="text-white text-decoration-none klik">Assistify Technologies</a></p>
    </footer>

    <!-- Bootstrap JS and dependencies -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js" integrity="sha384-oBqDVmMz4fnFO9gyb3+KnujsUR6g7U95RkFq3bRQGzVf0X0R9BcXsSm6a1T3McDGH" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-pzjw8f+ua7Kw1TIq0oQXb+g3Nl5U6B2q6U8c2hZyKXYz7klz0BYdkPjVsBzIjeF1" crossorigin="anonymous"></script>
</body>
</html>

