package com.example.catalog.repository;

import com.example.catalog.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    List<Item> findByNombreContainingIgnoreCase(String nombre);
}
