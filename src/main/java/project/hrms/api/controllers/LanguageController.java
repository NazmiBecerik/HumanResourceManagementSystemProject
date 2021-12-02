package project.hrms.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.LanguageService;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.Language;

@RestController
@RequestMapping("/api/languageController")
public class LanguageController {
    private LanguageService _languageService;
    public LanguageController(LanguageService languageService){
        this._languageService=languageService;
    }

    @PostMapping("/add")
    Result Add(Language language){
       return this._languageService.Add(language);
    }

}
