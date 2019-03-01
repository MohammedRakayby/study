package rakayby.spring.petclinic.services.map;

import java.util.Set;

import rakayby.spring.petclinic.models.Pet;
import rakayby.spring.petclinic.services.CrudService;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
	@Override
	public Set<Pet> findAll() {
		return super.findAll();
	}
	@Override
	public Pet findByID(Long id) {
		return super.findByID(id);
	}

	@Override
	public Pet save(Pet pet) {
		return super.save(pet.getId(), pet);
	}

	@Override
	public void delete(Pet pet) {
		super.delete(pet);
	}

	@Override
	public void deleteByID(Long id) {
		super.deleteByID(id);
	}
}
