package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    Result Add(Employer employer);
    Result Delete(Employer employer);
    DataResult<List<Employer>> GetAll();
}
