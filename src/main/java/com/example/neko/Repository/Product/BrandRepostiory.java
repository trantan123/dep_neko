package com.example.neko.Repository.Product;

import com.example.neko.Entity.Product.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepostiory extends JpaRepository<Brand, Integer> {
}
