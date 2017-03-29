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
                    Update an item
                </h1>

                <form style="margin: -3rem 5rem 3rem 5rem;">
                    <div class="add-form">
                        <label for="updateProdName">
                            Product name:
                        </label>
                        <input type="text" id="updateProdName" name="updateProdName" class="input-field" style="width: 20rem;" />
                    </div>

                    <div class="add-form">
                        <label for="updateProdDescription">
                            Product Description:
                        </label>
                        <input type="text" id="updateProdDescription" name="updateProdDescription" class="input-field" style="width: 20rem;" />
                    </div>

                    <div class="add-form">
                        <label for="updateProdQuantity">
                            Quantity:
                        </label>
                        <input type="number" id="updateProdQuantity" name="updateProdQuantity" class="input-field" style="width: 5rem;" />
                    </div>

                    <div class="add-form">
                        <label for="updateProdLocation">
                            Location:
                        </label>
                        <select id="updateProdLocation" name="updateProdLocation" style="min-width: 16rem;" >
                            <option value="nashville" selected>Nashville</option>
                            <option value="chattanooga">Chattanooga</option>
                            <option value="oak-ridge">Oak Ridge</option>
                        </select>
                    </div>

                    <div style="margin-top: 3rem; display: flex; justify-content: center;">
                        <button type="reset" name="cancel-request" class="button medium-button neutral">
                            Cancel
                        </button>

                        <button type="submit" name="delete-user" class="button medium-button danger">
                            Delete this item
                        </button>

                        <button type="submit" name="submit-request" class="button medium-button affirmative">
                            Update this item
                        </button>
                    </div>
                </form>
            </div>
        </section>
    </div>

    <footer>
        Prevent Child Abuse Tennessee
    </footer>

</body>
</html>
