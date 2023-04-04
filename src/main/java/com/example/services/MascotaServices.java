package com.example.services;

import java.util.List;

import com.example.entities.Mascota;


public interface MascotaServices {

    public List<Mascota> findAll();
    public Mascota findById(long id);
    public Mascota save(Mascota mascota);
    public void delete(Mascota mascota);
}
