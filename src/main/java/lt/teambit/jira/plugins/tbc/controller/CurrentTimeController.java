package lt.teambit.jira.plugins.tbc.controller;


import com.atlassian.connect.spring.ContextJwt;
import lt.teambit.jira.plugins.tbc.controller.api.CurrentTimeResponse;
import lt.teambit.jira.plugins.tbc.service.api.CurrentTimeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@ContextJwt
public class CurrentTimeController {

    private final CurrentTimeService demoService;

    public CurrentTimeController(CurrentTimeService demoService) {
        this.demoService = demoService;
    }

    @GetMapping(value = "/api/current-time", produces = "application/json")
    public ResponseEntity<CurrentTimeResponse> getCurrentTime() {
        CurrentTimeResponse response = new CurrentTimeResponse();
        response.setCurrentTime(demoService.getCurrentTime());
        return ResponseEntity.ok(response);
    }
}
