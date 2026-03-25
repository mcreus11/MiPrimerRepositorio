package com.example.catalog.api;

import com.example.catalog.api.dto.FilterRequest;
import com.example.catalog.domain.Item;
import com.example.catalog.service.ItemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {

    private final ItemService itemService;

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping
    public List<Item> getAll(@RequestParam(value = "nombre", required = false) String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            return itemService.findAll();
        }
        return itemService.filterByNombre(nombre);
    }

    @PostMapping("/filter")
    public List<Item> filter(@RequestBody FilterRequest request) {
        return itemService.filterByNombre(request.getNombre());
    }
}
