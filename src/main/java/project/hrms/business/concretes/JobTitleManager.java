package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobTitleService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.*;
import project.hrms.core.utilities.validates.concretes.CheckManager;
import project.hrms.dataAccess.abstracts.JobTitleDao;
import project.hrms.entities.concretes.JobTitle;

import java.util.List;
@Service
public class JobTitleManager implements JobTitleService {
    private JobTitleDao _jobTitleDao;
    @Autowired
    public JobTitleManager(JobTitleDao jobTitleDao){
        this._jobTitleDao=jobTitleDao;
    }

    @Override
    public Result Add(JobTitle jobTitle) {
        // business code -- entry
      //  CheckManager checkManager = new CheckManager(_jobTitleDao);
     //   if(!checkManager.jobTitleMatchCheck(jobTitle.getJobTitle()))
     //   {
     //       return new ErrorResult(Messages.jobTitleMatchError);
     //   }
     //   else {
           _jobTitleDao.save(jobTitle);
           return new SuccessResult(Messages.addedData);
      //  }


    }

    @Override
    public Result Delete(JobTitle jobTitle) {
        _jobTitleDao.delete(jobTitle);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<JobTitle>> GetAll() {

        return new SuccessDataResult<List<JobTitle>>(this._jobTitleDao.findAll(),Messages.getAllSuccessMessage);
    }
}


