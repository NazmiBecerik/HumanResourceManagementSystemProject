package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Cv;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;
import java.util.Optional;

public interface CvService {
    DataResult<List<Cv>> GetAll();
    Result Delete(int id);
    Optional<Cv> findById(int id);
}
