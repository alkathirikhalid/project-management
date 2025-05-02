package com.alkathirikhalid.projectmanagement.view.task;

import com.alkathirikhalid.projectmanagement.entity.Task;
import com.alkathirikhalid.projectmanagement.entity.TaskPriority;
import com.alkathirikhalid.projectmanagement.view.main.MainView;
import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.component.textarea.JmixTextArea;
import io.jmix.flowui.view.*;

@Route(value = "tasks/:id", layout = MainView.class)
@ViewController(id = "Task_.detail")
@ViewDescriptor(path = "task-detail-view.xml")
@EditedEntityContainer("taskDc")
public class TaskDetailView extends StandardDetailView<Task> {
    @Subscribe
    public void onInitEntity(final InitEntityEvent<Task> event) {
        event.getEntity().setPriority(TaskPriority.MEDIUM); // Default
    }

    @Subscribe("descriptionField")
    public void onDescriptionFieldComponentValueChange(final AbstractField.ComponentValueChangeEvent<JmixTextArea, ?> event) {
        /*  Bug UI and Controller, here it throws null event.getSource().setHelperText(event.getValue().toString().length() + "/" + 500);*/
        event.getSource().setHelperText(((event.getValue() != null) ? (event.getValue().toString()) : "").length() + "/" + 500);
    }
}