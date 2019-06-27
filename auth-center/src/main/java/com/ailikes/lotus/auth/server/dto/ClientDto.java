package com.ailikes.lotus.auth.server.dto;

import java.util.List;
import java.util.Set;

import com.ailikes.lotus.auth.server.model.Client;

public class ClientDto extends Client {

    private static final long serialVersionUID = 1475637288060027265L;

    private List<Long> permissionIds;

    private Set<Long> serviceIds;

    public List<Long> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<Long> permissionIds) {
        this.permissionIds = permissionIds;
    }

    public Set<Long> getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(Set<Long> serviceIds) {
        this.serviceIds = serviceIds;
    }
}
