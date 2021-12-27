package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobAdvertisement;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/employerController")
public class EmployerController
{
    private EmployerService _employerService;

    @Autowired
    public EmployerController(EmployerService employerService)
    {
    this._employerService=employerService;
    }

    @PostMapping("/add")
    Result Add(Employer employer)
    {
        return  this._employerService.Add(employer);
    }

    @PostMapping("/delete")
    Result Delete (int id)
    {
        return this._employerService.Delete(id);
    }

   @PostMapping("/addJobAdvertisement")
   Result AddJobAdvertisement(JobAdvertisement jobAdvertisement){
        this._employerService.AddJobAdvertisement(jobAdvertisement);
        return new SuccessResult(Messages.addedData);
   }

    @GetMapping("/getAll")
    DataResult<List<Employer>> GetAll()
    {
        return this._employerService.GetAll();
    }

    @GetMapping("/getById")
    Optional<Employer> findById(int id){
        return this._employerService.findById(id);
    }

}
