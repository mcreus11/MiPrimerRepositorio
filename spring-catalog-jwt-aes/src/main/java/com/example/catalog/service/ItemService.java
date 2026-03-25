package com.example.catalog.service;

import com.example.catalog.domain.Item;
import com.example.catalog.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    private final ItemRepository repository;

    public ItemService(ItemRepository repository) {
        this.repository = repository;
    }

    public List<Item> findAll() {
        return repository.findAll();
    }

    public List<Item> filterByNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return repository.findAll();
        }
        return repository.findByNombreContainingIgnoreCase(nombre.trim());
    }
}
