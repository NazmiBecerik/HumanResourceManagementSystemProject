package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import project.hrms.entities.concretes.JobTitle;
@Service
public interface JobTitleDao extends JpaRepository<JobTitle,Integer> {
    //JobTitle findByTitle(String jobTitle);


}
