BEGIN TRANSACTION;
ALTER TABLE family_inventory
ADD CONSTRAINT family_inventory_ibfk_1 FOREIGN KEY (inventory_id) 
  REFERENCES inventory (id)
    ON DELETE CASCADE
    ON UPDATE CASCADE;
 COMMIT TRANSACTION;
