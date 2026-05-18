package com.mossad.AmaPets_tec_medico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mossad.AmaPets_tec_medico.model.entities.TecMedico;
import com.mossad.AmaPets_tec_medico.service.TecMedicoService;
 
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/tecnicosmedicos")
@RestController
public class TecMedicoController {
    
    @Autowired
    private TecMedicoService tecMedicoService;

    @GetMapping("")
    public List<TecMedico> obtenerTodosLosTecMedicos() {
        return tecMedicoService.obtenerTodosLosTecMedicos();
    }

    @PostMapping("/crear")
    public TecMedico crearTecMedico(@RequestBody TecMedico tecMedico) {
        return tecMedicoService.crearTecMedico(tecMedico);
    }

    @PutMapping("/{id}")
    public TecMedico actualizarTecMedico(@PathVariable int id, @RequestBody TecMedico tecMedico) {
        return tecMedicoService.actualizarTecMedico(id, tecMedico);
    }

    @DeleteMapping("/{id}")
    public String eliminarTecMedico(@PathVariable int id) {
        return tecMedicoService.eliminarTecMedico(id);
    }

    

}
