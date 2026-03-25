package com.example.catalog.api.dto;

public class FilterRequest {
    private String nombre = "";

    public FilterRequest() {}
    public FilterRequest(String nombre) { this.nombre = nombre; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
}

