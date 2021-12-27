package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobAdvertisement;

import java.util.List;
import java.util.Optional;

public interface JobAdvertisementService {
    Result Delete(int id);
    DataResult<List<JobAdvertisement>> GetAll();
    Optional<JobAdvertisement> findById(int id);
}
