package com.pullrequesttrackingsystem.pullrequesttrackingsystem.service;
import com.pullrequesttrackingsystem.pullrequesttrackingsystem.model.GitHubPull;

import java.util.List;
public interface GitHubPullsService {
    List<GitHubPull> getGitHubPull();
    List<GitHubPull> getAllHubPull();

}
