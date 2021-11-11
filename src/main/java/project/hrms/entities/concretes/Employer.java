package project.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "employers")
@DiscriminatorValue("1")


@Table(name = "employers")
public class Employer extends User{
    @PrimaryKeyJoinColumn(name="id")
    private int id ;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "web_site")
    private String webSite;

    @Column(name = "phone_number")
    private String phoneNumber;

}
