package com.pullrequesttrackingsystem.pullrequesttrackingsystem.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.pullrequesttrackingsystem.pullrequesttrackingsystem.model.GitHubPull;
import org.springframework.stereotype.Repository;

@Repository
public interface GitHubPullsRepository extends MongoRepository<GitHubPull, String> {
}
