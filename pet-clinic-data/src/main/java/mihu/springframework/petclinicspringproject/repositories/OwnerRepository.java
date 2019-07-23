package mihu.springframework.petclinicspringproject.repositories;

import mihu.springframework.petclinicspringproject.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {

    Owner findByLastName(String lastName);
}
