package com.example.catalog.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PokemonService {
    private final RestTemplate restTemplate = new RestTemplate();

    public Object getDitto() {
        String url = "https://pokeapi.co/api/v2/pokemon/ditto";
        ResponseEntity<Object> response = restTemplate.getForEntity(url, Object.class);
        return response.getBody();
    }
}
