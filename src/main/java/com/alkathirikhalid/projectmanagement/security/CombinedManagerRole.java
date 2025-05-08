package com.alkathirikhalid.projectmanagement.security;

import io.jmix.security.role.annotation.ResourceRole;

@ResourceRole(name = "CombinedManagerRole", code = CombinedManagerRole.CODE)
public interface CombinedManagerRole extends ProjectManagetRole, UiMinimalRole{
    String CODE = "combined-manager-role";
}