package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.JobSeekerService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.*;
import project.hrms.core.utilities.validates.concretes.CheckManager;
import project.hrms.dataAccess.abstracts.CvDao;
import project.hrms.dataAccess.abstracts.JobSeekerDao;
import project.hrms.entities.concretes.Cv;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;
@Service
public class JobSeekerManager implements JobSeekerService {
    private JobSeekerDao _jobSeekerDao;
    private CvDao _cvDao;
    @Autowired
    public JobSeekerManager(JobSeekerDao jobSeekerDao,CvDao cvDao) {
        this._jobSeekerDao = jobSeekerDao;
        this._cvDao=cvDao;
    }


    @Override
    public Result Add(JobSeeker jobSeeker) throws Exception {
        CheckManager checkManager = new CheckManager(_jobSeekerDao);

        if (!checkManager.mailMatchCheckJobSeeker(jobSeeker.getEmail()))
        {
            return new ErrorResult(Messages.emailMatchError);
        } else if (!checkManager.mailRegexCheck(jobSeeker.getEmail()))
        {
            return new ErrorResult(Messages.mailRegexError);
        }
        else if (!checkManager.IdentityIdMatchCheck(jobSeeker.getIdentityId()))
        {
            return new ErrorResult(Messages.identityIdMatchError);
       }
       // if (!checkManager.mernisCheck())
       // {
       //     return new ErrorResult(Messages.mernisCheckError);
       // }
        else
        {
            this._jobSeekerDao.save(jobSeeker);
            return new SuccessResult((Messages.addedData));
        }
    }

    @Override
    public Result Delete(int id) {
        _jobSeekerDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<JobSeeker>> GetAll() {
        return new SuccessDataResult<List<JobSeeker>>(this._jobSeekerDao.findAll() ,Messages.getAllSuccessMessage);

    }

    @Override
    public Result AddCv(Cv cv) {
        this._cvDao.save(cv);
        return new SuccessResult(Messages.addedData);
    }

}
