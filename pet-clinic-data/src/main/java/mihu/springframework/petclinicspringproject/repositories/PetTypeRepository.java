package mihu.springframework.petclinicspringproject.repositories;

import mihu.springframework.petclinicspringproject.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
