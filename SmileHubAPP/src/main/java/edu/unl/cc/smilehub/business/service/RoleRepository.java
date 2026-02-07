package edu.unl.cc.smilehub.business.service;
import jakarta.ejb.Stateless;
import edu.unl.cc.smilehub.domain.security.Role;
import edu.unl.cc.smilehub.domain.security.Permission; // <-- ESTA ES LA ÚNICA QUE DEBE ESTAR
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

@Stateless
public class RoleRepository {

    private static final Map<String, Role> tableRoleBD = new TreeMap<>();

    static {
        // Inicializamos los roles básicos de SmileHub
        tableRoleBD.put("ADMIN", new Role(1L, "ADMIN"));
        tableRoleBD.put("SECRETARIA", new Role(2L, "SECRETARIA"));
        tableRoleBD.put("PACIENTE", new Role(3L, "PACIENTE"));

        loadPermissions();
    }

    private static void loadPermissions() {
        try {
            for (Role role : tableRoleBD.values()) {
                for (long i = 1; i <= 8; i++) {
                    // Llamada estática al repositorio de permisos
                    Permission p = PermissionRepository.find(i);

                    if (p != null) {
                        role.add(p);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("Error en RoleRepository al cargar permisos: " + e.getMessage());
        }
    }

    public Set<Role> findAllWithPermissions(){
        return Set.copyOf(tableRoleBD.values());
    }

    public Role find(String name){
        if (name == null) return null;
        // El trim() y toUpperCase() aseguran que "Secretaria " funcione igual que "SECRETARIA"
        return tableRoleBD.get(name.trim().toUpperCase());
    }
}