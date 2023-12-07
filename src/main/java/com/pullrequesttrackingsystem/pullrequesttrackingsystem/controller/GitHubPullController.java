package com.pullrequesttrackingsystem.pullrequesttrackingsystem.controller;

import com.pullrequesttrackingsystem.pullrequesttrackingsystem.model.GitHubPull;
import com.pullrequesttrackingsystem.pullrequesttrackingsystem.service.GitHubPullsService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/git-hub")
public class GitHubPullController {
    private final GitHubPullsService gitHubPullsService;

    @GetMapping("/pulls")
    public ResponseEntity<List<GitHubPull>> getGitHubPull() {
        return ResponseEntity.ok(this.gitHubPullsService.getGitHubPull());
    }

    @GetMapping("/pulls/get-all")
    public ResponseEntity<List<GitHubPull>> getAllHubPull() {
        return ResponseEntity.ok(this.gitHubPullsService.getAllHubPull());
    }

}
