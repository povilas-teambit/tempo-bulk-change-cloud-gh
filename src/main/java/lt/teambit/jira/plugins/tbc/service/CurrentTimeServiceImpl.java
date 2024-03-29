package lt.teambit.jira.plugins.tbc.service;

import lt.teambit.jira.plugins.tbc.service.api.CurrentTimeService;
import org.springframework.stereotype.Service;

@Service
public class CurrentTimeServiceImpl implements CurrentTimeService {
    @Override
    public String getCurrentTime() {
        return "null;";
    }
}
