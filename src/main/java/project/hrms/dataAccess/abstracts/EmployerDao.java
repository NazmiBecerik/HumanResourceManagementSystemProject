package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository <Employer,Integer>{
    Employer findByCompanyName(String name);
    Employer findById(int id);
    Employer findByWebSite(String webSite);
    Employer findByPhoneNumber(String phoneNumber);
}
