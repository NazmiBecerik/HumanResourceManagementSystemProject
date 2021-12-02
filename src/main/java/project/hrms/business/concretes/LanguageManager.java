package project.hrms.business.concretes;

import org.aspectj.bridge.Message;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.LanguageService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.LanguageDao;
import project.hrms.entities.concretes.Language;

import java.awt.geom.RectangularShape;
@Service
public class LanguageManager implements LanguageService {
    private LanguageDao _languageDao;
    public LanguageManager (LanguageDao languageDao)
    {
        this._languageDao=languageDao;
    }

    @Override
    public Result Add(Language language) {
        this._languageDao.save(language);
        return new SuccessResult(Messages.addedData);
    }
}