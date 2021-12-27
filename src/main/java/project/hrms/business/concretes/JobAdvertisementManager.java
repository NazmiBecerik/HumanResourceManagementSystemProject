package project.hrms.business.concretes;

import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobAdvertisementService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobAdvertisementDao;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobAdvertisement;

import java.util.List;
import java.util.Optional;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
    private JobAdvertisementDao _jobAdvertisementDao;
    public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao){
        this._jobAdvertisementDao=jobAdvertisementDao;
    }

    @Override
    public Result Delete(int id) {
        this._jobAdvertisementDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<JobAdvertisement>> GetAll() {
        return new SuccessDataResult<List<JobAdvertisement>>(this._jobAdvertisementDao.findAll(),Messages.getAllSuccessMessage);
    }

    @Override
    public Optional<JobAdvertisement> findById(int id) {
        return this._jobAdvertisementDao.findById(id);
    }
}
