package mihu.springframework.petclinicspringproject.services;

import mihu.springframework.petclinicspringproject.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
