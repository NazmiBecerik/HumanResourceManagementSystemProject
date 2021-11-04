package project.hrms.business.concretes;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobSeekerDao;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;
@Service
public class JobSeekerManager implements JobSeekerService {
    private JobSeekerDao _jobSeekerDao;

    public JobSeekerManager(JobSeekerDao jobSeekerDao) {
        this._jobSeekerDao = jobSeekerDao;
    }

    @Override
    public Result Add(JobSeeker jobSeeker) {
        _jobSeekerDao.save(jobSeeker);
        return new SuccessResult(Messages.AddedData);
    }

    @Override
    public Result Delete(JobSeeker jobSeeker) {
        _jobSeekerDao.delete(jobSeeker);
        return new SuccessResult(Messages.DeletedData);
    }

    @Override
    public DataResult<List<JobSeeker>> GetAll() {
        return new SuccessDataResult<List<JobSeeker>>(this._jobSeekerDao.findAll(),Messages.GetAllSuccessMessage);

    }
}
