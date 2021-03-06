package project.hrms.business.abstracts;

import org.springframework.stereotype.Service;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Cv;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.JobAdvertisement;

import java.util.List;
import java.util.Optional;

public interface EmployerService {
    Result Add(Employer employer);
    Result Delete(int id);
    DataResult<List<Employer>> GetAll();
    Result AddJobAdvertisement(JobAdvertisement jobAdvertisement);
    Optional<Employer> findById(int id);
}
