package mihu.springframework.petclinicspringproject.services.springdatajpa;

import mihu.springframework.petclinicspringproject.model.Visit;
import mihu.springframework.petclinicspringproject.repositories.VisitRepository;
import mihu.springframework.petclinicspringproject.services.VisitService;

import java.util.Set;

public class VisitSDJpaService implements VisitService {

    private final VisitRepository visitRepository;

    public VisitSDJpaService(VisitRepository visitRepository) {
        this.visitRepository = visitRepository;
    }

    @Override
    public Set<Visit> findAll() {
        return null;
    }

    @Override
    public Visit findById(Long aLong) {
        return null;
    }

    @Override
    public Visit save(Visit object) {
        return null;
    }

    @Override
    public void delete(Visit object) {

    }
}
