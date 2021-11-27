package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.School;

import java.util.List;

public interface SchoolService {
    Result Add(School school);
    Result Delete(int id);
    DataResult<List<School>> GetAll();
}
