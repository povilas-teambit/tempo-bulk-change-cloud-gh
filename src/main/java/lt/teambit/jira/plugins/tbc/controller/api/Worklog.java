package lt.teambit.jira.plugins.tbc.controller.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Worklog {

    @JsonProperty("created")
    public Date created;

    @JsonProperty("updated")
    public Date updated;

    @JsonProperty("started")
    public Date started;

    @JsonProperty("timeSpent")
    public String timeSpent;

    @JsonProperty("timeSpentSeconds")
    public int timeSpentSeconds;

    @JsonProperty("id")
    public String id;

    @JsonProperty("issueId")
    public String issueId;

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public Date getStarted() {
        return started;
    }

    public void setStarted(Date started) {
        this.started = started;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    public int getTimeSpentSeconds() {
        return timeSpentSeconds;
    }

    public void setTimeSpentSeconds(int timeSpentSeconds) {
        this.timeSpentSeconds = timeSpentSeconds;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIssueId() {
        return issueId;
    }

    public void setIssueId(String issueId) {
        this.issueId = issueId;
    }

    @Override
    public String toString() {
        return "Worklog{" +
                "created=" + created +
                ", updated=" + updated +
                ", started=" + started +
                ", timeSpent='" + timeSpent + '\'' +
                ", timeSpentSeconds=" + timeSpentSeconds +
                ", id='" + id + '\'' +
                ", issueId='" + issueId + '\'' +
                '}';
    }
}
