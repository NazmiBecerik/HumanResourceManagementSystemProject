package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.EmployerService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.*;
import project.hrms.core.utilities.validates.concretes.CheckManager;
import project.hrms.dataAccess.abstracts.EmployerDao;
import project.hrms.dataAccess.abstracts.JobAdvertisementDao;
import project.hrms.entities.concretes.Cv;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobAdvertisement;

import java.util.List;
import java.util.Optional;

@Service
public class EmployerManager implements EmployerService
{
    private EmployerDao _employerDao;
    private JobAdvertisementDao _jobAdvertisementDao;
    @Autowired
    public EmployerManager(EmployerDao employerDao,JobAdvertisementDao jobAdvertisementDao){
        this._employerDao=employerDao;
        this._jobAdvertisementDao=jobAdvertisementDao;
    }

    @Override
    public Result Add(Employer employer) {
        CheckManager employerCheckManager =new CheckManager(_employerDao);

        if(!employerCheckManager.mailMatchCheckEmployer(employer.getEmail()))
        {
            return new ErrorResult(Messages.emailMatchError);
        }
        else if (!employerCheckManager.mailRegexCheck(employer.getEmail()))
        {
            return new ErrorResult(Messages.mailRegexError);
        }
        else if (!employerCheckManager.domainCheck(employer.getWebSite(),employer))
        {
            return new ErrorResult(Messages.domainMatchError);
        }
         else if (!employerCheckManager.phoneNumberMatchCheck(employer.getPhoneNumber()))
        {
            return new ErrorResult(Messages.phoneNumberMatchError);
        }
        else
        {
            this._employerDao.save(employer);
            return new SuccessResult(Messages.addedData);
        }
    }

    @Override
    public Result Delete(int id) {
        this._employerDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }


    @Override
    public DataResult<List<Employer>> GetAll() {
        return new SuccessDataResult<List<Employer>>(this._employerDao.findAll());
    }

    @Override
    public Result AddJobAdvertisement(JobAdvertisement jobAdvertisement) {
        this._jobAdvertisementDao.save(jobAdvertisement);
        return new SuccessResult(Messages.addedData);
    }

    @Override
    public Optional<Employer> findById(int id) {
        return this._employerDao.findById(id);
    }
}
