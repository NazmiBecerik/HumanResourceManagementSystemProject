package project.hrms.api.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.CityService;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.City;

import java.util.List;

@RestController
@RequestMapping("/api/cityController")
public class CityController {
    private CityService _cityService;
    public CityController(CityService cityService){
        this._cityService=cityService;
    }

    @PostMapping("/add")
    Result Add(City city){
        return this._cityService.Add(city);
    }

    @PostMapping("/delete")
    Result Delete(int id){
        return this._cityService.Delete(id);
    }

    @GetMapping("/getAll")
    DataResult<List<City>>GetAll(){
        return this._cityService.GetAll();
    }
}
