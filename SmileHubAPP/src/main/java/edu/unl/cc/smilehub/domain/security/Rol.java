package edu.unl.cc.smilehub.domain.security;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

import java.security.Permissions;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Rol implements java.io.Serializable {

    private static final long serialVersionUID = 1L;

    private long id;

    @NotNull
    @NotEmpty
    private String name;

    private Set<Permissions> permissions = new HashSet<>();

    public Rol() {
        permissions = new HashSet<>();
    }

    public void AddPermission(Permissions permission) {
        if (permission != null) {
            if (!getPermissions().contains(permission)) {
                this.permissions.add(permission);
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rol rol = (Rol) o;
        return Objects.equals(getId(), rol.getId()) && Objects.equals(getName(), rol.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Permissions> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permissions> permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Role{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", permissions=").append(permissions);
        sb.append('}');
        return sb.toString();
    }
}