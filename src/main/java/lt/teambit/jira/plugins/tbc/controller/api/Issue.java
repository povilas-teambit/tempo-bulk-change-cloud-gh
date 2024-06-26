package lt.teambit.jira.plugins.tbc.controller.api;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Issue {

    @JsonProperty("id")
    private String id;

    @JsonProperty("self")
    private String self;

    @JsonProperty("key")
    private String key;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Issue{" +
                "id='" + id + '\'' +
                ", self='" + self + '\'' +
                ", key='" + key + '\'' +
                '}';
    }
}
