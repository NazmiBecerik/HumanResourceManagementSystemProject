package project.hrms.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.ProgrammingSkillService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.ProgrammingSkill;

import java.util.List;

@RestController
@RequestMapping("/api/programmingSkillController")
public class ProgrammingSkillController {
    private ProgrammingSkillService _programmingSkillService;
    public ProgrammingSkillController(ProgrammingSkillService programmingSkillService){
        this._programmingSkillService=programmingSkillService;
    }
    @PostMapping("/add")
    Result Add(ProgrammingSkill programmingSkill){
        return this._programmingSkillService.Add(programmingSkill);
    }

    @PostMapping("/delete")
    Result Delete(int id){
        return this._programmingSkillService.Delete(id);
    }

    @GetMapping("/getAll")
    DataResult<List<ProgrammingSkill>>GetAll(){
        return this._programmingSkillService.GetAll();
    }
}
