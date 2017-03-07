<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/app.css" media="screen" />
    <title>Update an item | PCAT Inventory Management</title>
</head>
<body>

    <nav>
        <a href="http://www.pcat.org/inventorymanagement">
            <img src="img/PCA-Logo_TN_2C_sm.jpg" alt="PCAT logo" class="pcat-logo">
        </a>
        <span><h2 style="margin: 0rem 5rem 3rem 5rem">${System.getenv("PCAT_ENVIRONTMENT_DISPLAY_TEXT")}</h2></span>
        <button name="logout" class="button logout-button neutral">
            Log out
        </button>
    </nav>

    <section>
        <div class="section-body">
            <h1>
                Update an item
            </h1>
        </div>

        <h3 style="margin: 4rem 8rem 2rem 8rem;">
            To remove an item from the inventory, set quantity to 0 (zero) before submitting.
        </h3>
    </section>

    <footer>
        Prevent Child Abuse Tennessee
    </footer>
</body>
</html>
