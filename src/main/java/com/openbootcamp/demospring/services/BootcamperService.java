package com.openbootcamp.demospring.services;

import com.openbootcamp.demospring.models.Bootcamper;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BootcamperService {
    private List<Bootcamper> usuarios = new ArrayList<Bootcamper>();

    public List<Bootcamper> getUsuarios() {
        return usuarios;
    }

    public void adicionar(Bootcamper bootcamper) {
        usuarios.add(bootcamper);
    }

    public Bootcamper get(String nombre) {
        for (Bootcamper b : usuarios) {
            if (b.getNombre().equals(nombre)) {
                return b;
            }
        }


        return null;
    }
}