package mihu.springframework.petclinicspringproject.services.map;

import mihu.springframework.petclinicspringproject.model.Visit;
import mihu.springframework.petclinicspringproject.services.VisitService;

import java.util.Set;

public class VisitServiceMap extends AbstractMapService<Visit, Long> implements VisitService {

    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet() == null || visit.getPet().getOwner() == null || visit.getPet().getId() == null) {
            throw new RuntimeException("Invalid visit");
        }
        return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
