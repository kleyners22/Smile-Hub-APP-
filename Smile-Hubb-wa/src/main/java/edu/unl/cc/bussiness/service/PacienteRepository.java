package edu.unl.cc.bussiness.service;

import edu.unl.cc.domain.admin.Paciente;

import java.util.List;

public interface PacienteRepository {
    void guardar(Paciente paciente);
    List<Paciente> obtenerTodos();
    boolean existe(String numeroIdentificacion);
}
