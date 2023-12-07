package com.pullrequesttrackingsystem.pullrequesttrackingsystem.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GitHubPullDto {
    @JsonProperty("url")
    private String url;

    @JsonProperty("node_id")
    private String nodeId;

    @JsonProperty("html_url")
    private String htmlUrl;

    @JsonProperty("diff_url")
    private String diffUrl;

    @JsonProperty("patch_url")
    private String patchUrl;

    @JsonProperty("issue_url")
    private String issueUrl;

    @JsonProperty("number")
    private int number;

    @JsonProperty("state")
    private String state;

    @JsonProperty("locked")
    private boolean locked;

    @JsonProperty("title")
    private String title;

    @JsonProperty("body")
    private String body;

    @JsonProperty("created_at")
    private String createdAt;

    @JsonProperty("updated_at")
    private String updatedAt;

    @JsonProperty("closed_at")
    private String closedAt;
}
