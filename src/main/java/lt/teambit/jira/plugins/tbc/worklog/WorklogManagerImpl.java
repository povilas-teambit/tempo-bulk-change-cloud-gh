package lt.teambit.jira.plugins.tbc.worklog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorklogManagerImpl implements WorklogManager {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public List<Worklog> getAllWorklogs() {
        return jdbcTemplate.query(
                "SELECT * FROM worklogs",
                (rs, rowNum) -> new Worklog(
                        rs.getInt("id"),
                        rs.getInt("issueID"),
                        rs.getString("self"),
                        rs.getString("timeSpent"),
                        rs.getString("started")
                )
        );
    }

    @Override
    public Worklog getWorklog(int id) {
        return jdbcTemplate.queryForObject(
                "SELECT * FROM worklogs WHERE id = ?",
                new Object[]{id},
                (rs, rowNum) -> new Worklog(
                        rs.getInt("id"),
                        rs.getInt("issueID"),
                        rs.getString("self"),
                        rs.getString("timeSpent"),
                        rs.getString("started")
                )
        );
    }

    @Override
    public Worklog createWorklog(Worklog worklog) {
        jdbcTemplate.update(
                "INSERT INTO worklogs(id, issueID, self, timeSpent, started) VALUES (?, ?, ?, ?, ?)",
                worklog.getId(), worklog.getIssueId(), worklog.getSelf(), worklog.getTimeSpent(), worklog.getStarted()
        );
        return worklog;
    }

    @Override
    public Worklog saveWorklog(Worklog worklog) {
        jdbcTemplate.update(
                "UPDATE worklogs SET issueID = ?, self = ?, timeSpent = ?, started = ? WHERE id = ?",
                worklog.getIssueId(), worklog.getSelf(), worklog.getTimeSpent(), worklog.getStarted(), worklog.getId()
        );
        return worklog;
    }
}
