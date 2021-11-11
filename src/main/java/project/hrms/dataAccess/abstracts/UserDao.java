package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import project.hrms.entities.concretes.User;
@Service
public interface UserDao extends JpaRepository<User,Integer> {}
