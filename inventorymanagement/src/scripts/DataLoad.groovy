import groovy.sql.Sql
def driver = 'com.microsoft.sqlserver.jdbc.SQLServerDriver'
def connectionString = "jdbc:sqlserver://pcat-stage-db-server.database.windows.net:1433;database=pcat-stage;user=pcat-administrator@pcat-stage-db-server;password={Nashville-Nashville-Stage};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;"
def sql = Sql.newInstance(connectionString,  "com.microsoft.sqlserver.jdbc.SQLServerDriver")