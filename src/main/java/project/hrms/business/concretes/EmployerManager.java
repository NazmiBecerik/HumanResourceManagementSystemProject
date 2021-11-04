package project.hrms.business.concretes;

import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.entities.concretes.Employer;

import java.util.List;
@Service
public class EmployerManager implements EmployerService
{
    private EmployerDao _employerDao;
    public EmployerManager(EmployerDao employerDao){
        this._employerDao=employerDao;
    }

    @Override
    public Result Add(Employer employer) {
        _employerDao.save(employer);
        return new SuccessResult(Messages.AddedData);
    }

    @Override
    public Result Delete(Employer employer) {
        _employerDao.delete(employer);
        return new SuccessResult(Messages.DeletedData);
    }

    @Override
    public DataResult<List<Employer>> GetAll() {
        return new SuccessDataResult<List<Employer>>(this._employerDao.findAll(),Messages.GetAllSuccessMessage);
    }
}
