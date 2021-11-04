package project.hrms.business.abstracts;

import org.springframework.boot.autoconfigure.batch.BatchProperties;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobTitle;

import java.util.List;

public interface JobTitleService {
    Result Add (JobTitle jobTitle);
    Result Delete(JobTitle jobTitle);
    DataResult<List<JobTitle>> GetAll();
}
