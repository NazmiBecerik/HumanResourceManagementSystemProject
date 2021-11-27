package project.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
@Table(name = "job_advertisements")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "description")
    private String description;
    @Column(name = "max_wage")
    private String maxWage;
    @Column(name = "min_wage")
    private String minWage;
    @Column(name = "is_active")
    private boolean activity;
    @Column(name = "creation_date")
    private String creationDate;
    @Column(name = "application_deadline")
    private String applicationDeadline ;
    @Column(name = "open_position")
    private int openPosition;
    @OneToOne
    @JoinColumn(name = "job_title_id",referencedColumnName = "id")
    private JobTitle jobTitle;
    @OneToOne
    @JoinColumn(name = "employer_id",referencedColumnName = "id")
    private Employer employer;
    @OneToOne
    @JoinColumn(name = "city_id",referencedColumnName = "id")
    private City city;



}
