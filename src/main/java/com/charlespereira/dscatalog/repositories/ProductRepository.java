package com.charlespereira.dscatalog.repositories;

import com.charlespereira.dscatalog.entities.Category;
import com.charlespereira.dscatalog.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
