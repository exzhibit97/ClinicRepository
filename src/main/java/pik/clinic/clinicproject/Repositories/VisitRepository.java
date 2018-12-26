package pik.clinic.clinicproject.Repositories;

import pik.clinic.clinicproject.Model.Visit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitRepository extends JpaRepository<Visit, Long> {
}
