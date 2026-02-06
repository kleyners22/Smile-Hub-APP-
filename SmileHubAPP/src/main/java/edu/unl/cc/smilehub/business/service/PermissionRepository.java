package edu.unl.cc.smilehub.business.service;

import jakarta.ejb.Stateless;
import edu.unl.cc.smilehub.domain.security.Permission;
import edu.unl.cc.smilehub.domain.security.ActionType;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Repositorio de Permisos para SmileHub
 */
@Stateless
public class PermissionRepository {

    private static final Map<Long, Permission> tablePermissionBD;

    static {
        tablePermissionBD = new TreeMap<>();

        // Configuración de permisos de acceso a las vistas .xhtml
        tablePermissionBD.put(1L, new Permission(1L, "/pages/secretaria/dashboard.xhtml", ActionType.ALL));
        tablePermissionBD.put(2L, new Permission(2L, "/pages/secretaria/pacientes.xhtml", ActionType.READ));
        tablePermissionBD.put(3L, new Permission(3L, "/pages/secretaria/citas.xhtml", ActionType.WRITE));
        tablePermissionBD.put(4L, new Permission(4L, "/pages/paciente/mis-citas.xhtml", ActionType.READ));
        tablePermissionBD.put(5L, new Permission(5L, "/pages/paciente/perfil.xhtml", ActionType.WRITE));
        tablePermissionBD.put(6L, new Permission(6L, "/index.xhtml", ActionType.READ));
        tablePermissionBD.put(7L, new Permission(7L, "/login.xhtml", ActionType.READ));
        tablePermissionBD.put(8L, new Permission(8L, "/pages/secretaria/reportes.xhtml", ActionType.READ));
    }

    // Método estático necesario para que RoleRepository pueda encontrar permisos por ID
    public static Permission find(Long id) { // <--- Asegúrate que diga STATIC
        return tablePermissionBD.get(id);
    }

    // Método para listar todos los permisos si fuera necesario
    public static List<Permission> findAll() {
        return List.copyOf(tablePermissionBD.values());
    }
}