package me.dio.academiadigital.service;

import me.dio.academiadigital.entity.Aluno;
import me.dio.academiadigital.entity.AvaliacaoFisica;
import me.dio.academiadigital.entity.form.AlunoForm;
import me.dio.academiadigital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);
    Aluno get(Long id);
    List<Aluno> getAll();
    Aluno update(Long id, AlunoUpdateForm formUpdate);
    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);

    List<Aluno> getAllByDataDeNascimento(String dataDeNascimento);
}
