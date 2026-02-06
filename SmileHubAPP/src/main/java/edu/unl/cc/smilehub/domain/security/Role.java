package edu.unl.cc.smilehub.domain.security;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Role implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull
    @NotEmpty
    private String name;

    // Ahora este Set usará TU clase Permission
    private Set<Permission> permissions;

    public Role() {
        this.permissions = new HashSet<>();
    }

    public Role(Long id, String name) {
        this();
        this.id = id;
        this.setName(name);
    }

    public void add(Permission permission){
        if (permission != null) {
            this.permissions.add(permission);
        }
    }

    // ... (El resto de getters y setters está perfecto)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) {
        this.name = (name != null) ? name.trim().toUpperCase() : null;
    }
    public Set<Permission> getPermissions() { return permissions; }
    public void setPermissions(Set<Permission> permissions) { this.permissions = permissions; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(id, role.id) && Objects.equals(name, role.name);
    }

    @Override
    public int hashCode() { return Objects.hash(id, name); }

    @Override
    public String toString() { return "Role{id=" + id + ", name='" + name + "'}"; }
}