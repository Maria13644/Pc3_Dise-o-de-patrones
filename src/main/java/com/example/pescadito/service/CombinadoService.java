package com.example.pescadito.service;

import com.example.pescadito.model.Combinado;
import com.example.pescadito.repository.CombinadoRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@NoRepositoryBean
@Service
public class CombinadoService {
    private final CombinadoRepository combinadoRepository;

    public CombinadoService(CombinadoRepository combinadoRepository){
        this.combinadoRepository = combinadoRepository;
    }

    public List<Combinado> listarTodas(){
        return combinadoRepository.findAll();
    }

    public Optional<Combinado> buscarPorID(Integer id){
        return combinadoRepository.findById(id);
    }

    public Combinado crearCombinado(Combinado combinado){
        return combinadoRepository.save(combinado);
    }

    public Combinado actualizarCombinado(Integer id, Combinado combinado){
        combinado.setId(id);
        return combinadoRepository.save(combinado);
    }

    public void eliminarPersona(Integer id){
        combinadoRepository.deleteById(id);
    }

    public Combinado combinadoDisponible(Boolean disponible, Combinado combinado){
        combinado.setDisponible(disponible);
        return combinadoRepository.save(combinado);
    }
}