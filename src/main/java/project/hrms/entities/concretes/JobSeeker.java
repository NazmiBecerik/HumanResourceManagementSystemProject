package project.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("2")
@Table(name = "job_seekers")
public class JobSeeker extends User {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_id")
    private String identityId;
    @Column(name = "birth_year")
    private String birthYear;

}
