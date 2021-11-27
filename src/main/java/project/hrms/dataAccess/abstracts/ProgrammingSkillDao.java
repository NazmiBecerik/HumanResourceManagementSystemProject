package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import project.hrms.entities.concretes.ProgrammingSkill;

public interface ProgrammingSkillDao extends JpaRepository<ProgrammingSkill,Integer> {

}
