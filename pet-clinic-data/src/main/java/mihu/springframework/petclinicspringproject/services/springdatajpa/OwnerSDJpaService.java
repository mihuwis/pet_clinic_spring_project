package mihu.springframework.petclinicspringproject.services.springdatajpa;

import mihu.springframework.petclinicspringproject.model.Owner;
import mihu.springframework.petclinicspringproject.repositories.OwnerRepository;
import mihu.springframework.petclinicspringproject.repositories.PetRepository;
import mihu.springframework.petclinicspringproject.repositories.PetTypeRepository;
import mihu.springframework.petclinicspringproject.services.OwnerService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class OwnerSDJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetTypeRepository petTypeRepository;
    private final PetRepository petRepository;

    public OwnerSDJpaService(OwnerRepository ownerRepository, PetTypeRepository petTypeRepository,
                             PetRepository petRepository) {
        this.ownerRepository = ownerRepository;
        this.petTypeRepository = petTypeRepository;
        this.petRepository = petRepository;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> findAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    /**
     * @param aLong id of {@link Owner}
     * @return it returns {@link Owner} from optional or Null if {@link Owner} does't exist
     */
    @Override
    public Owner findById(Long aLong) {
        Optional<Owner> optionalOwner = ownerRepository.findById(aLong);
        return optionalOwner.orElse(null);
    }

    @Override
    public Owner save(Owner object) {
        return ownerRepository.save(object);
    }

    @Override
    public void delete(Owner object) {
        ownerRepository.delete(object);
    }
}
