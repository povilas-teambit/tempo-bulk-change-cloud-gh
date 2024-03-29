package lt.teambit.jira.plugins.tbc.worklog;

import java.util.List;

public interface WorklogManager {

    List<Worklog> getAllWorklogs();

    Worklog getWorklog(int id);

    Worklog createWorklog(Worklog worklog);

    Worklog saveWorklog(Worklog worklog);

}
