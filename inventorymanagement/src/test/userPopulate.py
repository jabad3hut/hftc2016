import mysql.connector
# cnx = mysql.connector.connect(user='jabadehut', password='hftc2016', host='13.92.32.92', database='pcat')
cnx = mysql.connector.connect(user='root', password='root', host='localhost', database='pcat')
# cnx = mysql.connector.connect(host='localhost', database='pcat')

cursor = cnx.cursor()
cnx.autocommit = True

cursor.execute('delete from user')

user_insert_template = "insert into user (firstname, lastname, supervisor, email, role, supervisoremail, isactive) values(\"{0}\", \"{1}\", \"{2}\", \"{3}\", \"{4}\", \"{5}\", {6})"
cursor.execute(user_insert_template.format("Mary Beth", "Price", "Bonnie Fernandez", "mbprice.pcat@mailinator.com", "Home Visitor", "bfernandez.pcat@mailinator.com", 1))
cursor.execute(user_insert_template.format("Mary", "Bird", "Bonnie Fernandez", "mbird.pcat@mailinator.com", "Home Visitor", "bfernandez.pcat@mailinator.com", 0))
cursor.execute(user_insert_template.format("Beth", "Prices", "Cindy Lou Hoo", "bpricess.pcat@mailinator.com", "Home Visitor", "clouhoo.pcat@mailinator.com", 1))
cursor.execute(user_insert_template.format("Bonnie", "Fernandez", "Jennifer Caudle", "bfernandez.pcat@mailinator.com", "Supervisor", "jcaudle.pcat@mailinator.com", 1))
cursor.execute(user_insert_template.format("Bobby", "Brown", "Jennifer Caudle", "bbrown.pcat@mailinator.com", "Supervisor", "jcaudle.pcat@mailinator.com", 0))
cursor.execute(user_insert_template.format("Angie", "Taylor", "", "ataylor.pcat@mailinator.com", "User Admin", "", 1))










