package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import project.hrms.business.abstracts.JobTitleService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.JobTitleDao;
import project.hrms.entities.concretes.JobTitle;

import java.util.List;

@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao _jobTitleDao;
    @Autowired
    public JobTitleManager (JobTitleDao jobTitleDao){
        this._jobTitleDao=jobTitleDao;
    }
    @Override
    public Result Add(JobTitle jobTitle) {
        this._jobTitleDao.save(jobTitle);
        return new SuccessResult(Messages.addedData);
    }


    @Override
    public Result Delete(int id){

        this._jobTitleDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<JobTitle>> GetAll() {
        return new SuccessDataResult<List<JobTitle>>(this._jobTitleDao.findAll(),Messages.getAllSuccessMessage);
    }


}
