package project.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "job_experiences")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobExperience{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name")
    private String name;
    @JoinColumn(name ="job_title_id")
    @OneToOne
    private JobTitle jobTitle;
    @Column(name = "beginning_date")
    private String beginningDate;
    @Column(name = "ending_date")
    private String endingDate;
}
