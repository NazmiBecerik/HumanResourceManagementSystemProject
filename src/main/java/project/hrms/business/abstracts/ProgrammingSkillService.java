package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.ProgrammingSkill;

import java.util.List;

public interface ProgrammingSkillService {
    Result Add(ProgrammingSkill programmingSkill);
    Result Delete(int id);
    DataResult<List<ProgrammingSkill>>GetAll();

}
