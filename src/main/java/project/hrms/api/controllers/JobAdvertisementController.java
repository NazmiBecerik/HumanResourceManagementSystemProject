package project.hrms.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.JobAdvertisementService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobAdvertisement;
import project.hrms.entities.concretes.JobTitle;

import java.util.List;

@RestController
@RequestMapping("/api/jobAdvertisementController")
public class JobAdvertisementController {
    private JobAdvertisementService _jobAdvertisementService;
    public JobAdvertisementController (JobAdvertisementService jobAdvertisementService){
        this._jobAdvertisementService=jobAdvertisementService;
    }

    @PostMapping("/delete")
    Result Delete(int id){
        return this._jobAdvertisementService.Delete(id);
    }
    @GetMapping("/getAll")
    DataResult<List<JobAdvertisement>> GetAll()
    {
        return this._jobAdvertisementService.GetAll();
    }
}
