package edu.unl.cc.smilehub.business.service;
import jakarta.ejb.Stateless;
import edu.unl.cc.smilehub.domain.security.Rol;

import java.util.Set;

@Stateless
public class RoleRepository {

    private static void loadPermissions() {
        try {
            for (Rol rol : tableRoleBD.values()) {
                for (long i = 1; i <= 8; i++) {
                    // Llamada estática al repositorio de permisos
                    Permissions p = PermissionRepository.find(i);

                    if (p != null) {
                        rol.add(p);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error en RoleRepository al cargar permisos: " + e.getMessage());
        }
    }

    public Set<Rol> findAllWithPermissions(){
        return Set.copyOf(tableRoleBD.values());
    }

    public Rol find(String name){
        if (name == null) return null;
        // El trim() y toUpperCase() aseguran que "Secretaria " funcione igual que "SECRETARIA"
        return tableRoleBD.get(name.trim().toUpperCase());
    }
}