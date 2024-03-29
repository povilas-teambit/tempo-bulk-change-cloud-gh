package lt.teambit.jira.plugins.tbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class AddonApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(AddonApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication.run(AddonApplication.class, args);
    }

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public void run(String... args) throws Exception {

        log.info("Creating tables");
        jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS worklogs " +
                "(id INT, issueID INT, self VARCHAR(255), timeSpent VARCHAR(255), started VARCHAR(255));");
    }
}
