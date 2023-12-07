package com.pullrequesttrackingsystem.pullrequesttrackingsystem.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "github_pulls")
public class GitHubPull {
    @Id
    private String id;
    private String url;
    private String nodeId;
    private String htmlUrl;
    private String diffUrl;
    private String patchUrl;
    private String issueUrl;
    private int number;
    private String state;
    private boolean locked;
    private String title;
    private String body;
    private String createdAt;
    private String updatedAt;
    private String closedAt;

}
