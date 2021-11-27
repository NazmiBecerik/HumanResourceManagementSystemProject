package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    Result Add(JobTitle jobTitle);
    Result Delete(int id);
    DataResult<List<JobTitle>> GetAll();
}
