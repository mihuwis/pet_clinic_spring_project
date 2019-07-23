package mihu.springframework.petclinicspringproject.repositories;

import mihu.springframework.petclinicspringproject.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
