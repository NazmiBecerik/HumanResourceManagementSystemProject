package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.CvService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.entities.concretes.Cv;

import java.util.List;

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
}
