package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CvService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CvDao;
import project.hrms.entities.concretes.Cv;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;
import java.util.Optional;

@Service
public class CvManager implements CvService {
    private CvDao _cvDao;
    @Autowired
    public CvManager(CvDao cvDao){
        this._cvDao=cvDao;
    }
    @Override
    public DataResult<List<Cv>> GetAll() {
        return new SuccessDataResult<List<Cv>>(this._cvDao.findAll());
    }

    @Override
    public Result Delete(int id) {
        this._cvDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }
    @Override
    public Optional<Cv> findById(int id) {
        return this._cvDao.findById(id);
    }
}
