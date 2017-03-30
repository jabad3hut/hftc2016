<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<link rel="icon" type="image/png" href="img/PCA-Logo_TN_2C_sm_ico.png">
<script src="vendor/jquery-1.12.4.min.js"></script>
<script type="text/javascript" src="vendor/jquery.validate.min.js"></script>
<script type="text/javascript" src="vendor/additional-methods.min.js"></script>

<link rel="stylesheet" type="text/css" href="vendor/datatables.min.css" />

<script type="text/javascript" src="vendor/datatables.min.js"></script>

<script src="request.js"></script>
<link rel="stylesheet" type="text/css" href="css/app.css" media="screen" />
<title>Request an item | PCAT inventory</title>
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
				<h1>Request an item from our inventory</h1>

				<form action="foo" id="request-items" style="padding: 0 5rem;">

					<input type="hidden" name="userId" value="${user.id}"/>

					<div class="inline-directive">
						<h2>Enter the family number:</h2>

						<label><input type="text" name="familyNumber"
							class="input-field"></label>
					</div>

					<h2 style="margin: -2rem 5rem 3rem 5rem">
						Request an item by entering a quantity <br>and clicking the
						Request button for an item:
					</h2>

					<div style="padding: 0 5rem;">
						<table id="dataTable" name="dataTable">
							<thead>
								<tr>
									<th>Product Name</th>
									<th>Description</th>
									<th>Location</th>
									<th>Available</th>
									<th>Qty</th>
									<th>Action</th>
								</tr>
							</thead>
						</table>
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
