package project.hrms.business.concretes;

import org.aspectj.bridge.Message;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.SchoolService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.SchoolDao;
import project.hrms.entities.concretes.School;

import java.util.List;
@Service
public class SchoolManager implements SchoolService {
    private SchoolDao _schoolDao;
    public SchoolManager (SchoolDao schoolDao){
        this._schoolDao=schoolDao;
    }
    @Override
    public Result Add(School school) {
        this._schoolDao.save(school);
        return new SuccessResult(Messages.addedData);
    }

    @Override
    public Result Delete(int id) {
        this._schoolDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<School>> GetAll() {
        return new SuccessDataResult<List<School>>(this._schoolDao.findAll(),Messages.getAllSuccessMessage);
    }
}
