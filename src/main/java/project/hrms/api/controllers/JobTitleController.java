package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.JobTitleService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobTitle;

import java.util.List;

@RestController
@RequestMapping("/api/jobTitleController")
public class JobTitleController {
    private JobTitleService _jobTitleService;
    @Autowired
    public JobTitleController(JobTitleService jobTitleService){
        this._jobTitleService=jobTitleService;
    }
    @PostMapping("/add")
    Result Add(JobTitle jobTitle){
      return this._jobTitleService.Add(jobTitle);
    }
    @PostMapping("/delete")
    Result Delete( int id){
        return this._jobTitleService.Delete(id);
    }
    @GetMapping
    public DataResult<List<JobTitle>> GetAll(){
        return this._jobTitleService.GetAll();
    }
}
