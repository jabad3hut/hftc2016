package org.pcat.inventory.dao;

import org.pcat.inventory.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}
