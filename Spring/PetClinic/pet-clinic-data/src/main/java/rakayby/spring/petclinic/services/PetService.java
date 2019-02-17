package rakayby.spring.petclinic.services;

import java.util.Set;

import rakayby.spring.petclinic.models.Pet;

public interface PetService {
	Pet findByLastName(String lastName);
	Pet findById(Long id);
	Pet save(Pet pet);
	
	Set<Pet>findAll();
}
