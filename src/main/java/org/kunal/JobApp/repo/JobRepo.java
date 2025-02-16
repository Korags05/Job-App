package org.kunal.JobApp.repo;

import org.kunal.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1,
                    "Java Developer",
                    "Must have good experience in core Java and advanced Java",
                    2,
                    List.of("Core Java", "J2EE", "Spring Boot", "Hibernate"))
    ));


    public List<JobPost> getAllJobs() {
        return jobs;
    }

    public void addJob(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);
    }

}
