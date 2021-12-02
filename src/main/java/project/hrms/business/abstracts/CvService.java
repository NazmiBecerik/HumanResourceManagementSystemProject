package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.entities.concretes.Cv;

import java.util.List;

public interface CvService {
    DataResult<List<Cv>> GetAll();
}
