package com.alkathirikhalid.projectmanagement.security;

import com.alkathirikhalid.projectmanagement.entity.*;
import io.jmix.security.model.EntityAttributePolicyAction;
import io.jmix.security.model.EntityPolicyAction;
import io.jmix.security.role.annotation.EntityAttributePolicy;
import io.jmix.security.role.annotation.EntityPolicy;
import io.jmix.security.role.annotation.ResourceRole;
import io.jmix.securityflowui.role.annotation.MenuPolicy;
import io.jmix.securityflowui.role.annotation.ViewPolicy;

@ResourceRole(name = "ProjectManaget", code = ProjectManagetRole.CODE)
public interface ProjectManagetRole {
    String CODE = "project-managet";

    @EntityAttributePolicy(entityClass = Project.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Project.class, actions = EntityPolicyAction.ALL)
    void project();

    @EntityAttributePolicy(entityClass = Task.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = Task.class, actions = EntityPolicyAction.ALL)
    void task();

    @EntityAttributePolicy(entityClass = TimeEntry.class, attributes = "*", action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = TimeEntry.class, actions = EntityPolicyAction.ALL)
    void timeEntry();

    @EntityPolicy(entityClass = ProjectStats.class, actions = EntityPolicyAction.READ)
    void projectStats();

    @EntityAttributePolicy(entityClass = User.class, attributes = {"firstName", "lastName"}, action = EntityAttributePolicyAction.MODIFY)
    @EntityPolicy(entityClass = User.class, actions = {EntityPolicyAction.READ, EntityPolicyAction.UPDATE})
    void user();

    @MenuPolicy(menuIds = {"User.list", "Project.list", "Task_.list", "TimeEntry.list", "ProjectStats.list"})
    @ViewPolicy(viewIds = {"User.list", "Project.list", "Task_.list", "TimeEntry.list", "ProjectStats.list", "Project.detail", "Task_.detail", "TimeEntry.detail", "User.detail"})
    void screens();
}