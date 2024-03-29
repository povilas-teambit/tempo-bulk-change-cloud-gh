package lt.teambit.jira.plugins.tbc.controller.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WorklogCreatedEvent {

    @JsonProperty("timestamp")
    private String timestamp;

    @JsonProperty("webhookEvent")
    private String webHookEvent;

    @JsonProperty("worklog")
    private Worklog worklog;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getWebHookEvent() {
        return webHookEvent;
    }

    public void setWebHookEvent(String webHookEvent) {
        this.webHookEvent = webHookEvent;
    }

    public Worklog getWorklog() {
        return worklog;
    }

    public void setWorklog(Worklog worklog) {
        this.worklog = worklog;
    }

    @Override
    public String toString() {
        return "WorklogCreatedEvent{" +
                "timestamp='" + timestamp + '\'' +
                ", webHookEvent='" + webHookEvent + '\'' +
                ", worklog=" + worklog +
                '}';
    }
}
