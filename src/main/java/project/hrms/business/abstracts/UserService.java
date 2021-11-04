package project.hrms.business.abstracts;

import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.entities.concretes.User;

import java.util.List;

public interface UserService {
    Result Add(User user);
    Result Delete(User user);
   DataResult<List<User>> GetAll();

}
