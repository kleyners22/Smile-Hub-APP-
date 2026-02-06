package edu.unl.cc.smilehub.domain.security;

import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.io.Serializable;

public class Permission implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    @NotNull
    private String resource; // Ejemplo: "/pages/secretaria/dashboard.xhtml"

    private ActionType action;

    public Permission() {
    }

    public Permission(Long id, String resource, ActionType action) {
        this.id = id;
        this.resource = resource;
        this.action = action;
    }

    /**
     * Verifica si este permiso coincide con lo que el usuario intenta hacer.
     */
    public boolean matchWith(String requestResource, ActionType requestAction) {
        if (this.resource == null || requestResource == null) return false;

        return this.resource.equals(requestResource) &&
                (this.action.equals(ActionType.ALL) || this.action.equals(requestAction));
    }

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getResource() { return resource; }
    public void setResource(String resource) { this.resource = resource; }
    public ActionType getAction() { return action; }
    public void setAction(ActionType action) { this.action = action; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Permission that = (Permission) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(resource, that.resource) &&
                action == that.action;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, resource, action);
    }

    @Override
    public String toString() {
        return "Permission{" + "id=" + id + ", resource='" + resource + '\'' + ", action=" + action + '}';
    }
}