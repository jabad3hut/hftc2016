BEGIN transaction;
DROP TABLE IF EXISTS "family_inventory";

CREATE TABLE "family_inventory" (
ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
 "family_id" varchar(255) NOT NULL,
  "inventory_id" int NOT NULL,
  "quantity" int NOT NULL,
  "requested_date" datetime NOT NULL DEFAULT (GETDATE()),
  "status" varchar(45) DEFAULT NULL,
  "requestor_id" int DEFAULT NULL
) ;
COMMIT transaction;


  /*CONSTRAINT "family_inventory_ibfk_1" FOREIGN KEY ("inventory_id") REFERENCES inventory (id)
  */
