package com.curso.ecommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.curso.ecommerce.model.Orden;
@Repository
public interface iOrdenRepository extends JpaRepository<Orden, Integer>{

}