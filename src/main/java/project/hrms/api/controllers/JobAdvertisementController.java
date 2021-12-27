package project.hrms.api.controllers;

import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.JobAdvertisementService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobAdvertisement;
import project.hrms.entities.concretes.JobTitle;

import java.util.List;
import java.util.Optional;
@CrossOrigin
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

    @GetMapping("/getById")
    Optional<JobAdvertisement> findById(int id){
        return this._jobAdvertisementService.findById(id);
    }
}
