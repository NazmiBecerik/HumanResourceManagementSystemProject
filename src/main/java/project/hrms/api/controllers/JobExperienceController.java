package project.hrms.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobExperienceService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobExperience;

import java.util.List;

@RestController
@RequestMapping("/api/jobExperienceController")
public class JobExperienceController {
    private JobExperienceService _jobExperienceService;
    public  JobExperienceController(JobExperienceService jobExperienceService){
        this._jobExperienceService=jobExperienceService;
    }

    @PostMapping("/add")
    Result Add(JobExperience jobExperience){
        return this._jobExperienceService.Add(jobExperience);
    }

    @PostMapping("/delete")
    Result Delete(int id){
        return this._jobExperienceService.Delete(id);
    }

    @GetMapping("/getAll")
    DataResult<List<JobExperience>> GetAll(){
        return this._jobExperienceService.GetAll();
    }
}
