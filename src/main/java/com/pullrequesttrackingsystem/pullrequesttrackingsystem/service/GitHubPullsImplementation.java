package com.pullrequesttrackingsystem.pullrequesttrackingsystem.service;

import com.pullrequesttrackingsystem.pullrequesttrackingsystem.dto.GitHubPullDto;
import com.pullrequesttrackingsystem.pullrequesttrackingsystem.model.GitHubPull;
import com.pullrequesttrackingsystem.pullrequesttrackingsystem.repository.GitHubPullsRepository;
import com.pullrequesttrackingsystem.pullrequesttrackingsystem.service.external.GitHubExternalPulls;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class GitHubPullsImplementation implements GitHubPullsService{
    private final GitHubExternalPulls gitHubExternalPulls;
    private final GitHubPullsRepository gitHubPullsRepository;


    @Override
    public List<GitHubPull> getGitHubPull() {
        List<GitHubPull> gitHubPull = new ArrayList<>();
        List<GitHubPullDto> gitHubPullsDtoList = this.gitHubExternalPulls.getPullsDetails();
        gitHubPullsDtoList.forEach(gitHubPullDto -> {
            GitHubPull gitHubPulls = this.generateGitHubPullsObject(gitHubPullDto);
            gitHubPull.add(gitHubPulls);
        });
        this.gitHubPullsRepository.saveAll(gitHubPull);
        return gitHubPull;
    }

    @Override
    public List<GitHubPull> getAllHubPull() {
        return this.gitHubPullsRepository.findAll();
    }


    private GitHubPull generateGitHubPullsObject(GitHubPullDto gitHubPullDto) {
        return GitHubPull.builder()
                .url(gitHubPullDto.getUrl())
                .nodeId(gitHubPullDto.getNodeId())
                .htmlUrl(gitHubPullDto.getHtmlUrl())
                .diffUrl(gitHubPullDto.getDiffUrl())
                .patchUrl(gitHubPullDto.getPatchUrl())
                .issueUrl(gitHubPullDto.getIssueUrl())
                .number(gitHubPullDto.getNumber())
                .state(gitHubPullDto.getState())
                .locked(gitHubPullDto.isLocked())
                .title(gitHubPullDto.getTitle())
                .body(gitHubPullDto.getBody())
                .createdAt(gitHubPullDto.getCreatedAt())
                .updatedAt(gitHubPullDto.getUpdatedAt())
                .closedAt(gitHubPullDto.getClosedAt())
                .build();


    }
}
