package com.rake.homeproject.model;
public enum Role {
    ADMIN("Administrator", "Has full access and privileges."),
    USER("Accountant", "Can make invoices and view all invoices."),
    GUEST("User", "Regular user who can view invoices.");

    private final String roleName;
    private final String description;

    Role(String roleName, String description) {
        this.roleName = roleName;
        this.description = description;
    }

    public String getRoleName() {
        return roleName;
    }

    public String getDescription() {
        return description;
    }
}