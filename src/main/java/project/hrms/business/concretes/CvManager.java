package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CvService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.dataAccess.abstracts.CvDao;
import project.hrms.entities.concretes.Cv;

import java.util.List;
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
}
