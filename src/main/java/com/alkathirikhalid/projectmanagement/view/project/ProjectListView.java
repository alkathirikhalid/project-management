package com.alkathirikhalid.projectmanagement.view.project;

import com.alkathirikhalid.projectmanagement.entity.Project;
import com.alkathirikhalid.projectmanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;


@Route(value = "projects", layout = MainView.class)
@ViewController(id = "Project.list")
@ViewDescriptor(path = "project-list-view.xml")
@LookupComponent("projectsDataGrid")
@DialogMode(width = "64em")
public class ProjectListView extends StandardListView<Project> {
}