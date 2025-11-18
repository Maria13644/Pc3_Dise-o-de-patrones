package com.example.pescadito.controler;

import com.example.pescadito.model.Combinado;
import com.example.pescadito.service.CombinadoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping ("/api/combinado")

public class CombinadoController {
    private final CombinadoService combinadoService;
    public CombinadoController(CombinadoService combinadoService){
        this.combinadoService = combinadoService;
    }

    @GetMapping
    public List<Combinado> obtenerCombinado(){ return combinadoService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Combinado>
    obtenerCombinadoPorId(@PathVariable Integer id){
        return combinadoService.buscarPorID(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<?>
    crearCombinado(@RequestBody Combinado combinado){
        if (combinado.getNombre() == null ||combinado.getNombre().trim().isEmpty()){
            return ResponseEntity.badRequest().body("El nombre es obligatorio");
        }

        if (combinado.getDescripcion() == null || combinado.getDescripcion().trim().isEmpty()){
            return ResponseEntity.badRequest().body("La descripcion es obligatoria");
        }

        if (combinado.getPrecio() == null){
            return ResponseEntity.badRequest().body("El Precio es obligatorio");
        }

        if (combinado.getDisponible() == null) {
            return ResponseEntity.badRequest().body("La Disponibilidad es obligatoria");
        }

        if (combinado.getCategoria() == null) {
            return ResponseEntity.badRequest().body("La Categoria es obligatoria");
        }

        return ResponseEntity.ok(combinadoService.crearCombinado(combinado));
    }
}
