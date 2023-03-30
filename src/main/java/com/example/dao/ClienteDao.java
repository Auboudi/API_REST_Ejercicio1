package com.example.dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.entities.Cliente;

public interface ClienteDao extends JpaRepository<Cliente, Long> {

    @Query(value = "select c from Cliente c left join fetch c.hotel left join fetch c.mascota")
    public List<Cliente> findAll(Sort sort);

    @Query(value = "select c from Cliente c left join fetch c.hotel left join fetch c.mascota" ,
            countQuery = "select count(c) from Cliente c left join c.hotel left join c.mascota")       
    public Page<Cliente> findAll(Pageable pageable);

    @Query(value = "select c from Cliente c left join fetch c.hotel left join c.mascota where c.id = :id")
    public Cliente findById(long id);
    
}
