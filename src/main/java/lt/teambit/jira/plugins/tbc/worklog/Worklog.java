package lt.teambit.jira.plugins.tbc.worklog;

public class Worklog {
    private int id;
    private int issueId;
    private String self;
    private String timeSpent;
    private String started;

    public Worklog(int id, int issueId, String self, String timeSpent, String started) {
        this.id = id;
        this.issueId = issueId;
        this.self = self;
        this.timeSpent = timeSpent;
        this.started = started;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIssueId() {
        return issueId;
    }

    public void setIssueId(int issueId) {
        this.issueId = issueId;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getTimeSpent() {
        return timeSpent;
    }

    public void setTimeSpent(String timeSpent) {
        this.timeSpent = timeSpent;
    }

    public String getStarted() {
        return started;
    }

    public void setStarted(String started) {
        this.started = started;
    }

    @Override
    public String toString() {
        return String.format(
                "Worklog[id=%n, issueId=%n, self=%s, timeSpent=%s, started=%s]",
                id, issueId, self, timeSpent, started);
    }
}
