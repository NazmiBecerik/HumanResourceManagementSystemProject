package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.JobAdvertisement;

import java.util.List;

public interface JobAdvertisementService {
    Result Add(JobAdvertisement jobAdvertisement);
    Result Delete(int id);
    DataResult<List<JobAdvertisement>> GetAll();
}
