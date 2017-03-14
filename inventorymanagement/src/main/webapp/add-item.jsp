<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/app.css" media="screen" />
    <title>Add an item | PCAT inventory</title>
</head>
<body>

    <div class="content">
        <nav>
            <a href="http://www.pcat.org/">
                <img src="img/PCA-Logo_TN_2C_sm.jpg" alt="PCAT logo" class="pcat-logo">
            </a>
            <button name="logout" class="button logout-button neutral">
                Log out
            </button>
        </nav>

        <section>
            <div class="section-body">
                <h1>
                    Add an inventory item
                </h1>

                <form style="margin: -3rem 5rem 3rem 5rem;">
                    <div class="add-form">
                        <label for="prodName">
                            Product name:
                        </label>
                        <input type="text" id="prodName" name="prodName" class="input-field" style="width: 20rem;" />
                    </div>

                    <div class="add-form">
                        <label for="prodDescription">
                            Product Description:
                        </label>
                        <input type="text" id="prodDescription" name="prodDescription" class="input-field" style="width: 20rem;" />
                    </div>

                    <div class="add-form">
                        <label for="prodQuantity">
                            Quantity:
                        </label>
                        <input type="number" id="prodQuantity" name="prodQuantity" class="input-field" style="width: 5rem;" />
                    </div>

                    <div class="add-form">
                        <label for="prodLocation">
                            Location:
                        </label>
                        <select id="prodLocation" name="prodLocation" style="min-width: 16rem;" >
                            <option value="nashville" selected>Nashville</option>
                            <option value="chattanooga">Chattanooga</option>
                            <option value="oak-ridge">Oak Ridge</option>
                        </select>
                    </div>

                    <div style="margin-top: 3rem; display: flex; justify-content: center;">
                        <button type="reset" name="cancel-request" class="button medium-button neutral">
                            Cancel
                        </button>

                        <button type="submit" name="submit-request" class="button medium-button affirmative">
                            Add this item
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
