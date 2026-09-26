package edu.unl.cc.bussiness.service;

import edu.unl.cc.domain.admin.Doctor;

import java.util.List;

public interface DoctorRepository {
    void guardar(Doctor doctor);
    List<Doctor> obtenerTodos();
    boolean existe(String numeroIdentificacion);
}