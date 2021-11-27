package project.hrms.business.concretes;

import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.CityService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.CityDao;
import project.hrms.entities.concretes.City;

import java.util.List;
@Service
public class CityManager implements CityService {
    private CityDao _cityDao;
    public CityManager(CityDao cityDao){
        this._cityDao=cityDao;
    }
    @Override
    public Result Add(City city) {
        this._cityDao.save(city);
        return new SuccessResult(Messages.addedData);
    }

    @Override
    public Result Delete(int id) {
        this._cityDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<City>> GetAll() {
        return new SuccessDataResult<List<City>>(this._cityDao.findAll(),Messages.getAllSuccessMessage);
    }
}
