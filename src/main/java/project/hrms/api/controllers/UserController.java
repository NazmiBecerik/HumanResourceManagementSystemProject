package project.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import project.hrms.business.abstracts.UserService;
import project.hrms.core.utilities.messages.Messages;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.core.utilities.results.Result;
import project.hrms.core.utilities.results.SuccessDataResult;
import project.hrms.core.utilities.results.SuccessResult;
import project.hrms.entities.concretes.User;

import java.util.List;
@RestController
@RequestMapping("/api/userController")
public class UserController
{
    private UserService _userService;
    @Autowired
    public UserController(UserService userService){
        this._userService=userService;
    }

    @PostMapping("/add")
    Result Add(User user){
        return this._userService.Add(user);

    }
    @PostMapping("/delete")
    Result Delete(int id){
       return this._userService.Delete(id);
    }

    @GetMapping("/getAll")
    DataResult<List<User>> GetAll(){
       return this._userService.GetAll();

    }

}
