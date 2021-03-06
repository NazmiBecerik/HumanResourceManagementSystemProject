package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.City;

import java.util.List;

public interface CityService {
    Result Add(City city);
    Result Delete(int id);
    DataResult<List<City>>GetAll();
}
