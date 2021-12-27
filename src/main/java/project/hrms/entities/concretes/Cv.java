package project.hrms.entities.concretes;

import jdk.jfr.Enabled;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv")
@Entity
public class Cv{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @ManyToOne
    @JoinColumn(name = "city_id",referencedColumnName = "id")
    private City city;

    @ManyToOne
    @JoinColumn(name ="job_id",referencedColumnName = "id")
    private JobTitle jobTitle;

   // @ManyToOne
   // @JoinColumn(name ="job_seeker_id",referencedColumnName = "id")
   // private JobSeeker jobSeeker;
    @ManyToOne
    @JoinColumn(name = "language_id",referencedColumnName = "id")
    private Language language;

    @ManyToOne
    @JoinColumn(name ="school_id",referencedColumnName = "id")
    private School school;

    @ManyToOne
    @JoinColumn(name ="skill_id",referencedColumnName = "id")
    private ProgrammingSkill programmingSkill;

    @ManyToOne
    @JoinColumn(name="job_experience_id",referencedColumnName = "id")
    private JobExperience jobExperience;

    @OneToOne
    @JoinColumn(name = "job_seeker_id", referencedColumnName = "id")
    private User jobSeeker;



}
