package com.alkathirikhalid.projectmanagement.view.timeentry;

import com.alkathirikhalid.projectmanagement.entity.TimeEntry;
import com.alkathirikhalid.projectmanagement.entity.User;
import com.alkathirikhalid.projectmanagement.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.core.TimeSource;
import io.jmix.core.security.CurrentAuthentication;
import io.jmix.flowui.view.*;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value = "time-entries/:id", layout = MainView.class)
@ViewController(id = "TimeEntry.detail")
@ViewDescriptor(path = "time-entry-detail-view.xml")
@EditedEntityContainer("timeEntryDc")
public class TimeEntryDetailView extends StandardDetailView<TimeEntry> {
    @Autowired
    private TimeSource timeSource;
    @Autowired
    private CurrentAuthentication currentAuthentication;

    @Subscribe
    public void onInitEntity(final InitEntityEvent<TimeEntry> event) {
        event.getEntity().setEntryDate(timeSource.now().toLocalDateTime());
        final User user = (User) currentAuthentication.getUser();
        event.getEntity().setUser(user);
    }
}