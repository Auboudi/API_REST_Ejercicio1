package com.example.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.dao.MascotaDao;
import com.example.entities.Mascota;


@Service
public class MascotaServicesImpl implements MascotaServices {

    @Autowired
    private MascotaDao mascotaDao;

    @Override
    public List<Mascota> findAll() {
        return mascotaDao.findAll();
    }

    @Override
    public Mascota findById(long id) {
        return mascotaDao.findById(id).get();
    }

    @Override
    @Transactional
    public Mascota save(Mascota mascota) {
        return mascotaDao.save(mascota);
    }

    @Override
    @Transactional
    public void delete(Mascota mascota) {
        mascotaDao.delete(mascota);
    }
    
}
