package mihu.springframework.petclinicspringproject.services;

import mihu.springframework.petclinicspringproject.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet pet);
    Set<Vet> findAll();
}
