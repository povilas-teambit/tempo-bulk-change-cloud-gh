package lt.teambit.jira.plugins.tbc.controller;

import com.atlassian.connect.spring.AtlassianHostUser;
import com.atlassian.connect.spring.IgnoreJwt;
import lt.teambit.jira.plugins.tbc.worklog.WorkLogEvent;
import lt.teambit.jira.plugins.tbc.worklog.Worklog;
import lt.teambit.jira.plugins.tbc.worklog.WorklogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lt.teambit.jira.plugins.tbc.controller.api.WorklogCreatedEvent;
import org.springframework.http.ResponseEntity;


import java.util.List;

@RestController
@IgnoreJwt
public class WorklogEventController {

    private static final Logger log = LoggerFactory.getLogger(WorklogEventController.class);

    private final WorklogManager worklogManager;

    public WorklogEventController(WorklogManager worklogManager) {
        this.worklogManager = worklogManager;
    }

    @PostMapping("/worklog")
    public String getCreatedWorklog(@RequestBody WorkLogEvent workLogEvent, @AuthenticationPrincipal AtlassianHostUser hostUser) {
        WorkLogEvent worklog = workLogEvent;
        worklogManager.createWorklog(worklog.getWorklog());
        worklogManager.saveWorklog(worklog.setWorklog());
        return "worklog";
    }

    @GetMapping("/worklog")
    public List<Worklog> getSavedWorklogs() {
        worklogManager.getAllWorklogs();
        return worklogManager.getAllWorklogs();
    }

    @PostMapping(value ="/webhook/worklog-created", consumes = "application/json")
    public ResponseEntity<String> getWorklog(@AuthenticationPrincipal AtlassianHostUser hostUser, @RequestBody WorklogCreatedEvent event) {

        log.warn("User: {}", hostUser.getUserAccountId());
        log.warn("Issue id: {}", event.getWorklog().issueId);
        return ResponseEntity.ok("OK: ");

    }
}