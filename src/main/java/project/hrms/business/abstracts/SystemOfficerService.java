package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.SystemOfficer;

import java.util.List;

public interface SystemOfficerService {
    Result Add(SystemOfficer systemOfficer);
    Result Delete(int id);
    DataResult<List<SystemOfficer>> GetAll();
}
