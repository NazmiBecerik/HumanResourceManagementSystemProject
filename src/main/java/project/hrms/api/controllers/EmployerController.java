package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.entities.concretes.Employer;

import java.util.List;

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
   return  _employerService.Add(employer);

    }

    @PostMapping("/delete")
    Result Delete (Employer employer)
    {
        return _employerService.Delete(employer);
    }

    @GetMapping("/getAll")
    DataResult<List<Employer>> GetAll()
    {
        return this._employerService.GetAll();
    }
}
