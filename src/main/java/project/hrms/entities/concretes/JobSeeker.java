package project.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
@Data
@Table(name = "job_seekers")
public class JobSeeker extends User {
    @Id
    @Column(name = "jobseeker_id")
    private User id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "identity_id")
    private String identityId;

}
