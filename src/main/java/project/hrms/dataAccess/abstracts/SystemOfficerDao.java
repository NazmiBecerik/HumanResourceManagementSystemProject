package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.SystemOfficer;

public interface SystemOfficerDao extends JpaRepository<SystemOfficer,Integer>
{

}
