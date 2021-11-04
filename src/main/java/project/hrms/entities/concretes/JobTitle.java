package project.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="job_titles")
@Data
public class JobTitle {
    @Id
    @Column(name = "job_title_id")
    private int jobTitleId;
    @Column(name = "job_title")
    private String jobTitle;
}
