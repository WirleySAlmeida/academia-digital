package me.dio.academiadigital.controller;

import me.dio.academiadigital.entity.Matricula;
import me.dio.academiadigital.entity.form.MatriculaForm;
import me.dio.academiadigital.service.impl.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll() {
        return service.getAll();
    }

    @GetMapping("/bairro")
    public List<Matricula> getAllByBairro(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAllByBairro(bairro);
    }
}
