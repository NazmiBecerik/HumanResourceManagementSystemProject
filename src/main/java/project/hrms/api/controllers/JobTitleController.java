package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.JobTitleService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobTitle;

import java.util.List;

@RequestMapping("/api/jobTitleController")
@RestController
public class JobTitleController {
    private JobTitleService jobTitleService;

    @Autowired
    public JobTitleController(JobTitleService jobTitleService)
    {
        this.jobTitleService=jobTitleService;
    }

    @PostMapping("/add")
    public Result Add(@RequestBody JobTitle jobTitle)
    {
       return this.jobTitleService.Add(jobTitle);

    }

    @PostMapping("/delete")
    public Result Delete(@RequestBody JobTitle jobTitle){
        return this.jobTitleService.Delete(jobTitle);
    }

    @GetMapping("/getAll")
    public DataResult<List<JobTitle>>GetAll()
    {
        return this.jobTitleService.GetAll();
    }

}
