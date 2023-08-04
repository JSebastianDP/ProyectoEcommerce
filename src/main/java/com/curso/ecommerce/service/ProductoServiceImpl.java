package com.curso.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.curso.ecommerce.model.Producto;
import com.curso.ecommerce.repository.ProductoRepository;


@Service
//Se implementan los metodos crud
public class ProductoServiceImpl implements ProductoService{

	@Autowired
	private ProductoRepository productoRepository;
	
	@Override
	public Producto save(Producto producto) {
		return productoRepository.save(producto);
	}

	@Override
	public Optional<Producto> get(Integer Id) {
		return productoRepository.findById(Id);
	}

	@Override
	public void Update(Producto producto) {
		productoRepository.save(producto);
		
	}

	@Override
	public void Delete(Integer Id) {
		productoRepository.deleteById(Id);
	}

	@Override
	public List<Producto> findAll() {

		return productoRepository.findAll();
	}

}
