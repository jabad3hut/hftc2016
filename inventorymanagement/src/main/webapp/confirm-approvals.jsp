<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/app.css" media="screen" />
    <title>Confirm an approval | PCAT Inventory Management</title>
</head>
<body>

    <div class="content">
        <header>
            <a href="http://www.pcat.org/">
                <img src="img/PCA-Logo_TN_2C_sm.jpg" alt="PCAT logo" class="pcat-logo">
            </a>

            <button name="logout" class="button logout-button neutral">
                Log out
            </button>
        </header>

        <section>
            <nav id="nav-bar">
                <ul>
                    <li>                    <a href="request.html">             request an item     </a>    </li>
                    <li>                    <a href="review-approvals.html">    review approvals    </a>    </li>
                    <li id="manage-items">  <a href="listAllInventories.jsp">   manage items        </a>    </li>
                    <li id="manage-users">  <a href="listAllUsers.jsp">         manage users        </a>    </li>
                </ul>
            </nav>

            <script type="text/javascript">
                // when able to access user,
                //   1. replace the condition (currently a string) in each if statement below with the logic it describes
                //      (currently the conditions both evaluate to true since any string except "" evaluates to true)
                //   2. uncomment the body of each if statement
                //   3. feel free to delete this comment block

                if ('user.role === homeVisitor') {
                    // document.getElementById("nav-bar").classList.add("hidden");
                } else if ('user.role === supervisor') {
                    // document.getElementById("manage-items").classList.add("hidden");
                    // document.getElementById("manage-users").classList.add("hidden");
                }
            </script>

            <div class="section-body">
                <h2>
                    Request approved.
                </h2>

                <h3>
                    You’ll receive an email confirming your approval of the request.
                </h3>

                <button name="approvals-return" class="button medium-button affirmative" onclick="history.back(1)">
                    Return to pending approvals list
                </button>
            </div>
        </section>
    </div>

    <footer>
        Prevent Child Abuse Tennessee
    </footer>

</body>
</html>
