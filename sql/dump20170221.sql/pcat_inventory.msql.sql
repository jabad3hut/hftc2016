BEGIN transaction;
DROP TABLE IF EXISTS "inventory";
CREATE TABLE "inventory" (
  ID INT NOT NULL IDENTITY(1,1) PRIMARY KEY,
  "total_inventory" int NOT NULL DEFAULT 0,
  "reserved_inventory" int NOT NULL DEFAULT 0,
  "product_name" varchar(45) DEFAULT NULL,
  "product_desc" varchar(45) DEFAULT NULL,
  "location" varchar(45) DEFAULT NULL
);
COMMIT transaction;
