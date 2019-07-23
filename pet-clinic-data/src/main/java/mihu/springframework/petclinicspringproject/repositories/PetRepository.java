package mihu.springframework.petclinicspringproject.repositories;

import mihu.springframework.petclinicspringproject.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
