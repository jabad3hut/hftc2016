<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="icon" type="image/png" href="img/PCA-Logo_TN_2C_sm_ico.png">
    <script src="vendor/jquery-1.12.4.min.js"></script>
    <link rel="stylesheet" type="text/css" href="vendor/datatables.min.css"/>

    <script type="text/javascript" src="vendor/datatables.min.js"></script>

    <link rel="stylesheet" type="text/css" href="css/app.css" media="screen" />
    <title>Review approvals | PCAT Inventory Management</title>

<script type="text/javascript">

var url = "listAllInventoriesPending"
	$(document).ready(function(){
	    $('#dataTable').DataTable( {
	        "ajax": {
	            "url": url,
	            "dataSrc": ""
	        },
	        "columnDefs": [
	            { "targets": "_all", "className": "table-cell" },
	            { "targets": 0, "data": "requestor"},
	            { "targets": 1, "data": "familyId" },
	            { "targets": 2, "data": "productName" },
	            { "targets": 3, "data": "location" },
	            { "targets": 4, "data": "quantity" },
	            { "targets": 5, "data": "status" },
	            { "targets": 7, "data": "id", "visible": true },
	            { "targets": 6, "render":
	              function(data, type, row, meta) {
	            	  console.log(row);
	            	  console.log(row.id);
	            	  console.log(row.familyInventory.id);
	                  return '<a onclick="approveRequest('+row.id+');">Approve</a>';
	              }
	            }
	        ]
	    } );
	});

	function approveRequest(id)  {
	    userId = $('#request-items input[name=userId]').val();
	    var payload = {
	        "userId": userId,
	        "familyInventoryId": id
	   };
	    var $form = $('<form method="POST" action="requestApproval"></form>');
	    for (var key in payload) {
	        $('<input>').attr('type','hidden').attr('name',key).attr('value',payload[key]).appendTo($form);
	    }
	    $(document.body).append($form)
	    $form.submit();
	}

</script>

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
                <h1>
                    Review pending approvals
                </h1>

                <form action="foo" id="request-items" style="padding: 0 5rem;">

                    <input type="hidden" name="userId" value="${user.id}">

                    <h2 style="margin: -2rem 5rem 3rem 5rem">
                        Approve a request by clicking the Approve button for an item:
                    </h2>

                    <div style="padding: 0 5rem;">
                        <table id="dataTable">
                            <thead>
                                <tr>
                                    <th>Requester</th>
                                    <th>Family</th>
                                    <th>Product</th>
                                    <th>Location</th>
                                    <th>Quantity</th>
                                    <th>Status</th>
                                    <th>Action</th>
                                    <th>Inventory Id</th>
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
