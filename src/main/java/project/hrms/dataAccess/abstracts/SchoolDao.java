package project.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.w3c.dom.stylesheets.LinkStyle;
import project.hrms.core.utilities.results.DataResult;
import project.hrms.entities.concretes.JobSeeker;
import project.hrms.entities.concretes.School;

import java.util.List;

public interface SchoolDao extends JpaRepository<School,Integer> {
    DataResult<List<JobSeeker>> getAllByOrderByGraduateYearDesc();
}
