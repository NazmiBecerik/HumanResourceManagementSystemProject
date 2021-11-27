package project.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.dataAccess.abstracts.UserDao;
import project.hrms.entities.concretes.User;

import java.util.List;
@Service
public class UserManager implements UserService {
    private UserDao _userDao;
    @Autowired
    public UserManager(UserDao userDao){
        this._userDao=userDao;
    }


    @Override
    public Result Add(User user) {

        // business code -- entry

        this._userDao.save(user);
        return new SuccessResult(Messages.addedData);
    }

    @Override
    public Result Delete(int id) {
        this._userDao.deleteById(id);
        return new SuccessResult(Messages.deletedData);
    }

    @Override
    public DataResult<List<User>> GetAll() {
        return new SuccessDataResult<List<User>>(this._userDao.findAll(),Messages.getAllSuccessMessage);
    }
}
