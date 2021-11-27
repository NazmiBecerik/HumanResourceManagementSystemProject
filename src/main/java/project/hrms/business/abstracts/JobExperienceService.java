package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobExperience;

import java.util.List;

public interface JobExperienceService {
    Result Add(JobExperience jobExperience);
    Result Delete(int id);
    DataResult<List<JobExperience>> GetAll();
}
