package project.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
@Data
@Table(name = "employers")
public class Employer extends User{
    @Id
    @Column(name = "employer_id")
    private User id;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "employer_id")
    private String webSite;
    @Column(name = "employer_id")
    private String phoneNumber;


}
