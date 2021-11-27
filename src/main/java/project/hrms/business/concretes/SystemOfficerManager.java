package project.hrms.business.concretes;

import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.SystemOfficerService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.SystemOfficerDao;
import project.hrms.entities.concretes.SystemOfficer;

import java.util.List;
@Service
public class SystemOfficerManager implements SystemOfficerService {
    private SystemOfficerDao _systemOfficerDao;
    public SystemOfficerManager(SystemOfficerDao systemOfficerDao){
        this._systemOfficerDao=systemOfficerDao;
    }
    @Override
    public Result Add(SystemOfficer systemOfficer) {
        this._systemOfficerDao.save(systemOfficer);
        return new SuccessResult(Messages.addedData);
    }

    @Override
    public Result Delete(int id) {
        this._systemOfficerDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<SystemOfficer>> GetAll() {
        return new SuccessDataResult<List<SystemOfficer>>(this._systemOfficerDao.findAll(),Messages.getAllSuccessMessage);
    }
}
