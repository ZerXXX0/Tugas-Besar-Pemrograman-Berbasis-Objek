<%-- 
    Document   : index
    Created on : May 12, 2025, 1:37:10 PM
    Author     : Fathan Fardian Sanum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>ASSISTIFY - Digital Personal Assistant</title>
    <link rel="stylesheet" href="styles.css">
    <link href='https://fonts.googleapis.com/css?family=Space Grotesk' rel='stylesheet'>
</head>
<body>
    <header>
        <div class="logo">
            <img src="assets/Logo.png" alt="ASSISTIFY Logo"> <!-- Logo image -->
        </div>
        <nav>
            <ul>
                <li><a href="#">About us</a></li>
                <li><a href="#">Services</a></li>
                <li><a href="#">Use Cases</a></li>
                <li><a href="#">Feature</a></li>
                <li><a href="login_page.jsp" class="login-link">Log In</a></li>
            </ul>
        </nav>
    </header>

    <section class="hero">
        <div class="hero-content">
            <div class="hero-text">
                <h1>Manage your day with your very own digital personal assistant</h1>
                <p>Our application helps people grow and succeed with their lives through digital personal assistant. We help people manage their daily, works, schedule, etc.</p>
                <a href="registration_page.jsp" class="btn">Get Started Now</a>
            </div>
            <div class="hero-icons">
                <img src="assets/DashboardImage.png" alt="Icons Set" class="icon-set-img">
            </div>
        </div>
    </section>

    <!-- Features Section with 4 boxes -->
    <section class="features">
        <h2>Features</h2>
        <div class="feature-boxes">
            <div class="feature-box1">
                <h3>Note and Voice Note</h3>
                <div class="feature-icon">
                    <img src="assets/IconNote.png" alt="Note Icon">
                </div>
                <div class="feature-content">
                    
                    
                </div>
                <div class="feature-logo">
                    <img src="assets/LogoPanah1.png" alt="Logo" class="feature-logo-img">
                    <a href="#">Learn more</a>
                </div>
            </div>
            <div class="feature-box2">
                <h3>To-Do List</h3>
                <div class="feature-icon">
                    <img src="assets/IconToDo.png" alt="To-Do List Icon">
                </div>
                <div class="feature-content">
                    
                    
                </div>
                <div class="feature-logo">
                    <img src="assets/LogoPanah2.png" alt="Logo" class="feature-logo-img">
                    <a href="#">Learn more</a>
                </div>
            </div>
            <div class="feature-box2">
                <h3>Daily Reminder</h3>
                <div class="feature-icon">
                    <img src="assets/IconReminder.png" alt="Reminder Icon">
                </div>
                <div class="feature-content">
                    
                    
                </div>
                <div class="feature-logo">
                    <img src="assets/LogoPanah2.png" alt="Logo" class="feature-logo-img">
                    <a href="#">Learn more</a>
                </div>
            </div>
            <div class="feature-box1">
                <h3>Alarm Clock</h3>
                <div class="feature-icon">
                    <img src="assets/IconAlarm.png" alt="Alarm Icon">
                </div>
                <div class="feature-content">
                    
                    
                </div>
                <div class="feature-logo">
                    <img src="assets/LogoPanah1.png" alt="Logo" class="feature-logo-img">
                    <a href="#">Learn more</a>
                </div>
            </div>
        </div>
    </section>

    <footer>
        <p>&copy; 2025 Assistify. All rights reserved.</p>
        <p>Powered by <a href="#">Assistify Technologies</a></p>
    </footer>
</body>
</html>
