package mihu.springframework.petclinicspringproject.services.map;

import mihu.springframework.petclinicspringproject.model.Pet;
import mihu.springframework.petclinicspringproject.services.CrudService;
import mihu.springframework.petclinicspringproject.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }
}
