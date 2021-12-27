package project.hrms.business.concretes;

import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobExperienceService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobExperienceDao;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobExperience;

import java.util.List;
import java.util.Optional;

@Service
public class JobExperienceManager implements JobExperienceService {
    private JobExperienceDao _jobExperienceDao;
    public JobExperienceManager(JobExperienceDao jobExperienceDao){
        this._jobExperienceDao=jobExperienceDao;
    }
    @Override
    public Result Add(JobExperience jobExperience) {
        this._jobExperienceDao.save(jobExperience);
        return new SuccessResult(Messages.addedData);
    }

    @Override
    public Result Delete(int id) {
        this._jobExperienceDao.deleteById(id);
        return new SuccessResult(Messages.addedData);
    }

    @Override
    public DataResult<List<JobExperience>> GetAll() {
        return new SuccessDataResult<List<JobExperience>>(this._jobExperienceDao.findAll());
    }
    @Override
    public Optional<JobExperience> findById(int id) {
        return this._jobExperienceDao.findById(id);
    }
}
