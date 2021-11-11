package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.Employer;
import project.hrms.entities.concretes.User;

import java.util.List;

public interface EmployerDao extends JpaRepository<Employer,Integer>
{
    Employer findByEmail(String email);
    Employer findByWebSite(String website);
    Employer findByPhoneNumber(String phoneNumber);
}
