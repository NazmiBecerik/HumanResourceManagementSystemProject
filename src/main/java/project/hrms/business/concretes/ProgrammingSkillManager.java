package project.hrms.business.concretes;

import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.ProgrammingSkillService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.ProgrammingSkillDao;
import project.hrms.entities.concretes.ProgrammingSkill;

import java.util.List;
@Service
public class ProgrammingSkillManager implements ProgrammingSkillService {
    private ProgrammingSkillDao _programmingSkillDao;
    public ProgrammingSkillManager(ProgrammingSkillDao programmingSkillDao){
        this._programmingSkillDao=programmingSkillDao;
    }
    @Override
    public Result Add(ProgrammingSkill programmingSkill) {
        this._programmingSkillDao.save(programmingSkill);
        return new SuccessResult(Messages.addedData);
    }

    @Override
    public Result Delete(int id) {
        this._programmingSkillDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<ProgrammingSkill>> GetAll() {
        return new SuccessDataResult<List<ProgrammingSkill>>(this._programmingSkillDao.findAll(),Messages.getAllSuccessMessage);
    }
}
