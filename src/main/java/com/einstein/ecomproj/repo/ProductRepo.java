package com.einstein.ecomproj.repo;

import com.einstein.ecomproj.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product,Integer> {
    //JPQL
}
