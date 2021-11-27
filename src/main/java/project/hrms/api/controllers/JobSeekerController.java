package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.ErrorDataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;
@RestController
@RequestMapping("/api/jobSeekerController")
public class JobSeekerController
{
    private JobSeekerService _jobSeekerService;
    @Autowired
    public JobSeekerController(JobSeekerService jobSeekerService)
    {
        this._jobSeekerService=jobSeekerService;
    }

    @PostMapping("/add")
        Result Add(JobSeeker jobSeeker) throws Exception {
           return this._jobSeekerService.Add(jobSeeker);
    }

    @PostMapping("/delete")
        Result Delete (int id)
    {
          return this._jobSeekerService.Delete(id);

    }

    @GetMapping("/getAll")
        DataResult<List<JobSeeker>> GetAll()
        {
            return this._jobSeekerService.GetAll();
        }

}

