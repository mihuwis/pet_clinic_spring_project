package mihu.springframework.petclinicspringproject.services;

import mihu.springframework.petclinicspringproject.model.Owner;

import java.util.Set;

public interface CrudService<T, ID> {

    Set<T> findAll();

    T findById(ID id);

    T save(T object);

    void delete(T object);

}
