<%-- 
    Document   : home_page
    Created on : May 22, 2025, 5:11:35 PM
    Author     : Fathan Fardian Sanum
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Home - Digital Assistant</title>
    <!-- Bootstrap 5.0.2 CDN -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="styles.css">
    <style>
        body {
            background: url('assets/IMG_6703.jpg') no-repeat center center fixed;
            background-size: cover;
            color: white;
            position: relative;
        }
        .sidebar {
            position: fixed;
            top: 0;
            left: 0;
            height: 100%;
            width: 80px;
            background-color: #FF3B65;
            display: flex;
            flex-direction: column;
            align-items: center;
            padding-top: 20px;
        }
        .sidebar .nav-link {
            color: white;
            margin-bottom: 20px;
            font-size: 18px;
            text-align: center;
        }
        .sidebar .nav-link:hover {
            color: #000;
            background-color: white;
            border-radius: 5px;
        }
        
        .content {
            margin-left: 100px;
            padding: 40px;
        }
        .card {
            color: black;
            background-color: rgba(255, 255, 255, 0.8); /* White with slight transparency */
            border-radius: 10px;
            padding: 20px;
        }
        .card-header {
            background-color: transparent !important;
            border-bottom: none !important;
            padding: 0;
            padding-bottom: 15px;
            color: black;
            font-weight: bold;
        }
        .todo-list, .reminder-list, .alarm-list {
            list-style-type: none;
            padding-left: 0;
        }
        .todo-list li, .reminder-list li, .alarm-list li {
            margin-bottom: 10px;
            color: black;
        }
        .btn-danger {
            background-color: #FF3B65;
        }
        /* Profile, Add, and Settings Icons */
        .profile-container {
            position: absolute;
            top: 20px;
            right: 20px;
            display: flex;
            align-items: center;
            color: white;
        }
        .profile-name {
            margin-left: 15px;
            font-size: 18px;
        }
        .add-icon {
            position: absolute;
            top: 20px;
            left: 20px;
            font-size: 30px;
            color: white;
        }
        .settings-icon {
            position: absolute;
            bottom: 20px;
            left: 20px;
            font-size: 30px;
            color: white;
        }
        .settings-link {
            position: absolute;
            bottom: 20px;
            left: 10px;
            font-size: 18px;
            color: white;
        }
    </style>
</head>
<body>

    <!-- Profile Icon with Name -->
    <div class="profile-container">
        <a href="profile.jsp" class="profile-icon">
            <img src="assets/Avatar.png.png" alt="Profile" style="width: 20px; height: 20px;" class="profile-icon" id="profile-icon">
        </a>
        <span class="profile-name">FansaGantenk</span>
    </div>

    <!-- Add Icon -->
    <a href="add_task.jsp" class="add-icon">
        <i class="fas fa-plus-circle"></i>
    </a>

    <!-- Sidebar -->
    <div class="sidebar">
        <!-- Home Link with Image Icon -->
        <a href="#" class="nav-link">
            <img src="assets/LogoHome.png" alt="Home" style="width: 40px; height: 40px;" class="sidebar-icon" id="home-icon">
        </a>
        
        <!-- Alarm Link with Image Icon -->
        <a href="#" class="nav-link">
            <img src="assets/LogoAlarm.png" alt="Alarm" style="width: 40px; height: 40px;" class="sidebar-icon" id="alarm-icon">
        </a>
        
        <!-- Notification Link with Image Icon -->
        <a href="#" class="nav-link">
            <img src="assets/LogoNotif.png" alt="Notification" style="width: 40px; height: 40px;" class="sidebar-icon" id="notif-icon">
        </a>
        
        <!-- Notes Link with Image Icon -->
        <a href="#" class="nav-link">
            <img src="assets/LogoNotes.png" alt="Notes" style="width: 40px; height: 40px;" class="sidebar-icon" id="notes-icon">
        </a>
        
        <!-- Calendar Link with Image Icon -->
        <a href="#" class="nav-link">
            <img src="assets/LogoCalendar.png" alt="Calendar" style="width: 40px; height: 40px;" class="sidebar-icon" id="calendar-icon">
        </a>
        
        <!-- To-Do Link with Image Icon -->
        <a href="#" class="nav-link">
            <img src="assets/LogoToDoList.png" alt="To-Do" style="width: 40px; height: 40px;" class="sidebar-icon" id="todo-icon">
        </a>
        
        <!-- Settings Link (Added at the bottom of the sidebar) -->
        <a href="settings.jsp" class="settings-link">
            <img src="assets/LogoSetting.png" alt="Settings" style="width: 40px; height: 40px;" class="sidebar-icon" id="settings-icon">
        </a>
    </div>

    <!-- Main Content -->
    <div class="content">
        <!-- Header -->
        <div class="d-flex justify-content-between align-items-center mt-5">
            <h1>Hello, FansaGantenk!</h1>
        </div>
        <div class="d-flex justify-content-between align-items-center mb-5">
            <p>What can I do for you today?</p>
        </div>

        <!-- Today Section -->
        <div class="row">
            <h2>Today</h2> <!-- Added "Today" label here -->
            <!-- To-Do List Card -->
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">
                        To-Do List
                    </div>
                    <ul class="todo-list">
                        <li>Not snitchin' on gang</li>
                        <li>Sell dope</li>
                        <li>Rob a nigga</li>
                        <li>Get money</li>
                        <li>Rep the set</li>
                        <li>Pop the opp</li>
                        <li>Buy some milk</li>
                        <li>Visit baby mama</li>
                    </ul>
                </div>
            </div>
            <!-- Alarm Card -->
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">
                        Alarm
                    </div>
                    <ul class="alarm-list">
                        <li>08:00 Wake tf up</li>
                        <li>16:00 Wake tf up</li>
                        <li>23:00 Smoke weed errday</li>
                    </ul>
                </div>
            </div>
            <!-- Reminder Card -->
            <div class="col-md-4">
                <div class="card">
                    <div class="card-header">
                        Reminder
                    </div>
                    <ul class="reminder-list">
                        <li>08:00 Get some help</li>
                        <li>16:00 Slide on opp</li>
                        <li>23:00 Smoke weed errday</li>
                    </ul>
                </div>
            </div>
        </div>

        <!-- Notes and Voice Note -->
        <div class="row mt-4">
            <!-- Note Card -->
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header">
                        Note
                    </div>
                    <p>Got a top from a stripper bitch</p>
                    <p>She from Kankakee</p>
                </div>
            </div>
            <!-- Voice Note Card -->
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header">
                        Voice Note
                    </div>
                    <audio controls>
                        <source src="your-voice-note-file.mp3" type="audio/mpeg">
                        Your browser does not support the audio element.
                    </audio>
                </div>
            </div>
        </div>

        <!-- Tomorrow Section (Same structure as today) -->
        <div class="row mt-4">
            <h2>Tomorrow</h2> <!-- Added "Tomorrow" label here -->
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header">
                        Tomorrow's Alarm
                    </div>
                    <ul class="alarm-list">
                        <li>08:00 Wake tf up</li>
                        <li>16:00 Wake tf up</li>
                        <li>23:00 Smoke weed errday</li>
                    </ul>
                </div>
            </div>
            <div class="col-md-6">
                <div class="card">
                    <div class="card-header">
                        Tomorrow's Note
                    </div>
                    <p>Just got a top from a stripper bitch</p>
                    <p>She from Kankakee...</p>
                </div>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka9H3GMh7dQssI40c5n8O11Fpb0pSQZxQSTH5tf9QmjAcqfOgnMw2uZxtFsiqgdF" crossorigin="anonymous"></script>

    <script>
        // JavaScript to change the image on hover
        document.getElementById("home-icon").onmouseover = function() {
            this.src = "assets/HomeHover.png";  // Change to hover image
        };
        document.getElementById("home-icon").onmouseout = function() {
            this.src = "assets/LogoHome.png";  // Change back to default image
        };
        
        document.getElementById("alarm-icon").onmouseover = function() {
            this.src = "assets/AlarmHover.png";
        };
        document.getElementById("alarm-icon").onmouseout = function() {
            this.src = "assets/LogoAlarm.png";
        };

        document.getElementById("notif-icon").onmouseover = function() {
            this.src = "assets/NotifHover.png";
        };
        document.getElementById("notif-icon").onmouseout = function() {
            this.src = "assets/LogoNotif.png";
        };
        
        document.getElementById("notes-icon").onmouseover = function() {
            this.src = "assets/NotesHover.png";
        };
        document.getElementById("notes-icon").onmouseout = function() {
            this.src = "assets/LogoNotes.png";
        };

        document.getElementById("calendar-icon").onmouseover = function() {
            this.src = "assets/CalendarHover.png";
        };
        document.getElementById("calendar-icon").onmouseout = function() {
            this.src = "assets/LogoCalendar.png";
        };

        document.getElementById("todo-icon").onmouseover = function() {
            this.src = "assets/ToDoListHover.png";
        };
        document.getElementById("todo-icon").onmouseout = function() {
            this.src = "assets/LogoToDoList.png";
        };

        document.getElementById("settings-icon").onmouseover = function() {
            this.src = "assets/SettingHover.png";
        };
        document.getElementById("settings-icon").onmouseout = function() {
            this.src = "assets/LogoSetting.png";
        };
    </script>
</body>
</html>
