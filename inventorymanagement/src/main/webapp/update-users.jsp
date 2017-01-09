<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="css/app.css" media="screen" />
    <title>Update a user | PCAT inventory</title>
</head>
<body>

    <div class="content">
        <form action="updateUser">
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
                        Update a user
                    </h1>

                    <form style="margin: -3rem 5rem 3rem 5rem;">
                        <div class="add-form">
                            <label for="updateFirstName">
                                First name:
                            </label>
                            <input type="text" id="updateFirstName" name="firstName" class="input-field" style="width: 15rem;" />
                        </div>

                        <div class="add-form">
                            <label for="updateLastName">
                                Last name:
                            </label>
                            <input type="text" id="updateLastName" name="lastName" class="input-field" style="width: 15rem;" />
                        </div>

                        <div class="add-form">
                            <label for="updateUserEmail">
                                Email address:
                            </label>
                            <input type="email" id="updateUserEmail" name="userEmail" class="input-field" style="width: 19rem;" />
                        </div>

                        <div class="add-form">
                            <label for="updateUserRole">
                                Role:
                            </label>
                            <select id="updateUserRole" name="userRole" style="min-width: 14rem;" >
                                <option value="visitor" selected>Home Visitor</option>
                                <option value="supervisor">Supervisor</option>
                                <option value="admin">User Admin</option>
                            </select>
                        </div>

                        <div class="add-form">
                            <label for="updateSupervisorName">
                                Supervisor:
                            </label>
                            <select id="updateSupervisorName" name="supervisorName" style="min-width: 18rem;" >
                                <option value="value1" selected>Bonnie Fernandez</option>
                                <option value="value2">Cindie Lou Hoo</option>
                                <option value="value3">Jennifer Caudle</option>
                            </select>
                        </div>
                        <!--<div class="add-form">-->
                            <!--<label for="updateSupervisorEmail">-->
                                <!--Supervisor’s email address:-->
                            <!--</label>-->
                            <!--<input type="email" id="updateSupervisorEmail" name="supervisorEmail" class="input-field" style="width: 20rem;" />-->
                        <!--</div>-->

                        <div style="margin-top: 2rem;">
                            <button type="reset" name="cancel-request" class="button medium-button neutral" style="margin: 0 3rem 5rem 3rem;">
                                Cancel
                            </button>

                            <button type="submit" name="delete-user" class="button medium-button danger" style="margin: 0 3rem 5rem 3rem;">
                                Delete this user
                            </button>

                            <button type="submit" name="submit-request" class="button medium-button affirmative" style="margin: 0 3rem 5rem 3rem;">
                                Update this user
                            </button>
                        </div>
                    </form>
                </div>
            </section>
        </form>
    </div>

    <footer>
        Prevent Child Abuse Tennessee
    </footer>

</body>
</html>
