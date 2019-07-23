package mihu.springframework.petclinicspringproject.repositories;


import mihu.springframework.petclinicspringproject.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}
