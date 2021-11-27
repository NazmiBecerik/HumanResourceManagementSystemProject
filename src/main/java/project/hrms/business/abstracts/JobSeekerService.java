package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;

public interface JobSeekerService {
    Result Add(JobSeeker jobSeeker) throws Exception;
    Result Delete(int id);
    DataResult<List<JobSeeker>> GetAll();
}
