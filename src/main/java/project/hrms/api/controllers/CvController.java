package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import project.hrms.business.abstracts.CvService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Cv;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/api/cvController")
public class CvController {
    private CvService _cvService;
    @Autowired
    public CvController(CvService cvService){
        this._cvService=cvService;
    }
    @GetMapping("/getAll")
    DataResult<List<Cv>> GetAll(){
        return this._cvService.GetAll();
    }
    @PostMapping("/delete")
    Result Delete(int id){
        return this._cvService.Delete(id);
    }
    @GetMapping("/getById")
    Optional<Cv> findById(int id){
        return this._cvService.findById(id);
    }

}
