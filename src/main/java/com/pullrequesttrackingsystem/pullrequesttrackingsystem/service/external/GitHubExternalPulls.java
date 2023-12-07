package com.pullrequesttrackingsystem.pullrequesttrackingsystem.service.external;
import com.pullrequesttrackingsystem.pullrequesttrackingsystem.dto.GitHubPullDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
@Slf4j
public class GitHubExternalPulls {
    private final RestTemplate restTemplate;

    @Value("${github.pulls-detail-url}")
    private String gitHubPullsDetailsUrl;

    public GitHubExternalPulls(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }


    public List<GitHubPullDto> getPullsDetails() {
        ResponseEntity<List<GitHubPullDto>> response = restTemplate.exchange(gitHubPullsDetailsUrl, HttpMethod.GET, null, new ParameterizedTypeReference<>() {
        });
        return response.getBody();
    }
}
