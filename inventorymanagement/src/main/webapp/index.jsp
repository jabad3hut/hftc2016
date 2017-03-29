<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/png" href="img/PCA-Logo_TN_2C_sm_ico.png">
<link rel="stylesheet" type="text/css" href="css/app.css" media="screen" />
<title>PCAT Inventory Management</title>
</head>
<body>

    <div class="content">
        <header>
            <a href="http://www.pcat.org/">
                <img src="img/PCA-Logo_TN_2C_sm.jpg" alt="PCAT logo" class="pcat-logo">
            </a>
        </header>

        <section>
            <nav>
                <ul>
                    <li class="underlined"><a href="request.jsp">request an item</a></li>
                    <li class="underlined"><a href="review-approvals.jsp">review approvals</a></li>
                    <li class="underlined"><a href="listAllInventories.jsp">manage items</a></li>
                    <li class="underlined"><a href="listAllUsers.jsp">manage users</a></li>
                </ul>
            </nav>

            <div class="section-body">
                <h1>
                    Log in
                </h1>

                <div class="login-card">
                    <form class="login-form" action="loginPage">
                        <input type="email" class="login-input" value="" spellcheck="false"
                            name="email" id="email" placeholder="Enter your email address"
                            autofocus>
                        <button name="submit" class="button big-button affirmative">
                            Submit</button>
                    </form>

                </div>

            </div>
        </section>
    </div>

	<footer> Prevent Child Abuse Tennessee </footer>

</body>
</html>
