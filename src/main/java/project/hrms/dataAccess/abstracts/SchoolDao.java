package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.School;

public interface SchoolDao extends JpaRepository<School,Integer> {
}
