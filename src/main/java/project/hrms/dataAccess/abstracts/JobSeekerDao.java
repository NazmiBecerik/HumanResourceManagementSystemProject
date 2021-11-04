package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.JobSeeker;

public interface JobSeekerDao extends JpaRepository<JobSeeker,Integer> {
    JobSeeker findByFirstNameAndLastName(String firstName,String lastName);
    JobSeeker findByIdentityId(String identityId);
}
