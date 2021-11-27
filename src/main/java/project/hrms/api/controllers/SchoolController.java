package project.hrms.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.SchoolService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.School;

import java.util.List;

@RestController
@RequestMapping("/api/schoolController")
public class SchoolController {
    private SchoolService _schoolService;
    public SchoolController(SchoolService schoolService){
        this._schoolService=schoolService;
    }
    @PostMapping("/add")
    Result Add(School school){
        return this._schoolService.Add(school);
    }

    @PostMapping("/delete")
    Result Delete (int id){
        return this._schoolService.Delete(id);
    }

    @GetMapping("/getAll")
    DataResult<List<School>> GetAll(){
        return this._schoolService.GetAll();
    }
}
