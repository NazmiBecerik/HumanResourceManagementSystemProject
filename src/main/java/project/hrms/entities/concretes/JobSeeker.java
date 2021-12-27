package project.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity(name = "job_seekers")
@PrimaryKeyJoinColumn(name = "id")
@DiscriminatorValue("2")
@Table(name = "job_seekers")
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User{
    @PrimaryKeyJoinColumn(name="id")
    @Id
    private int id ;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identity_id")
    private String identityId;

    @Column(name = "birth_year")
    private String birthYear;



}
