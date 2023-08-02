package com.curso.ecommerce.service;

import java.util.Optional;

import com.curso.ecommerce.model.Producto;

public interface ProductoService {
public Producto save(Producto producto);
public Optional<Producto> get(Integer Id);
public void Update(Producto producto);
public void Delete(Integer Id);
}
