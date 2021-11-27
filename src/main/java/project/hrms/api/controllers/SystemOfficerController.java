package project.hrms.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.SystemOfficerService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.SystemOfficer;

import java.util.List;

@RestController
@RequestMapping("/api/systemOfficerController")
public class SystemOfficerController {

    private SystemOfficerService _systemOfficerService;
    public SystemOfficerController(SystemOfficerService systemOfficerService){
        this._systemOfficerService=systemOfficerService;
    }
    @PostMapping("/add")
    Result Add(SystemOfficer systemOfficer){
    return this._systemOfficerService.Add(systemOfficer);
    }
    @PostMapping("/delete")
    Result Delete(int id){
       return this._systemOfficerService.Delete(id);
    }
    @GetMapping("getAll")
    DataResult<List<SystemOfficer>> GetAll(){
        return this._systemOfficerService.GetAll();
    }
}
