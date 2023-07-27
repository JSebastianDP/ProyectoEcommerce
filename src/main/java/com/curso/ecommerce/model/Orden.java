package com.curso.ecommerce.model;

import java.util.Date;

public class Orden {
private Integer id;
private String nombre;
private Date fechaCreacion;
private Date fechaRecibida;
private Double total;

public Orden() {
	// TODO Auto-generated constructor stub
}

public Orden(Integer id, String nombre, Date fechaCreacion, Date fechaRecibida, Double total) {
	super();
	this.id = id;
	this.nombre = nombre;
	this.fechaCreacion = fechaCreacion;
	this.fechaRecibida = fechaRecibida;
	this.total = total;
}

public Integer getId() {
	return id;
}

public void setId(Integer id) {
	this.id = id;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public Date getFechaCreacion() {
	return fechaCreacion;
}

public void setFechaCreacion(Date fechaCreacion) {
	this.fechaCreacion = fechaCreacion;
}

public Date getFechaRecibida() {
	return fechaRecibida;
}

public void setFechaRecibida(Date fechaRecibida) {
	this.fechaRecibida = fechaRecibida;
}

public Double getTotal() {
	return total;
}

public void setTotal(Double total) {
	this.total = total;
}

@Override
public String toString() {
	return "Orden [id=" + id + ", nombre=" + nombre + ", fechaCreacion=" + fechaCreacion + ", fechaRecibida="
			+ fechaRecibida + ", total=" + total + "]";
}




}

