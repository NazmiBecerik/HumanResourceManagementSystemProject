package project.hrms.entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity(name = "employers")
@DiscriminatorValue("1")
@AllArgsConstructor
@NoArgsConstructor
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
