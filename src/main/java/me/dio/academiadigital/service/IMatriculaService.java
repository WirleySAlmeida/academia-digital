package me.dio.academiadigital.service;

import me.dio.academiadigital.entity.Matricula;
import me.dio.academiadigital.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);
    Matricula get(Long id);
    List<Matricula> getAll();
    void delete(Long id);

    List<Matricula> getAllByBairro(String bairro);
}
