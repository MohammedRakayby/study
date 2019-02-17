package rakayby.spring.petclinic.services;

import java.util.Set;

import rakayby.spring.petclinic.models.Vet;

public interface VetService {
	Vet findByLastName(String lastName);
	Vet findById(Long id);
	Vet save(Vet vet);
	
	Set<Vet>findAll();
}
