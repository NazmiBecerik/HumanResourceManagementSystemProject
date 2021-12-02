package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.entities.concretes.JobSeeker;

import java.util.List;

@Service
public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {

    JobSeeker findByIdentityId(String identityId);
    JobSeeker findByEmail(String email);
  //  DataResult<List<JobSeeker>> GetAllOrderByGraduateYearDesc();
}
