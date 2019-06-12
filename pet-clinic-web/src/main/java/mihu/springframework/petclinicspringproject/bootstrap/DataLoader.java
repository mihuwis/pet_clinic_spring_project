package mihu.springframework.petclinicspringproject.bootstrap;

import mihu.springframework.petclinicspringproject.model.Owner;
import mihu.springframework.petclinicspringproject.model.Vet;
import mihu.springframework.petclinicspringproject.services.OwnerService;
import mihu.springframework.petclinicspringproject.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }


    @Override
    public void run(String... args) throws Exception {

        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Fionna");
        owner2.setLastName("Glenne");

        ownerService.save(owner2);

        System.out.println("Loaded Owners...");

        Vet vet1 = new Vet();
        vet1.setFirstName("Sam");
        vet1.setLastName("Axe");

        vetService.save(vet1);


        Vet vet2 = new Vet();
        vet2.setFirstName("Derren");
        vet2.setLastName("Oxe");

        vetService.save(vet2);

        System.out.println("Loaded Vets...");

    }
}
