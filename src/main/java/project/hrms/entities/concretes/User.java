package project.hrms.entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Table(name = "users")
@Data
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id ;
    @Column(name="user_mail")
    private String email;
    @Column(name="user_password")
    private String password;
    @Column(name = "email_verification")
    private boolean mailVerification ;
}
