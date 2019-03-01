package rakayby.spring.petclinic.services.map;

import java.util.Set;

import rakayby.spring.petclinic.models.Vet;
import rakayby.spring.petclinic.services.CrudService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CrudService<Vet, Long> {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	@Override
	public Vet findByID(Long id) {
		return super.findByID(id);
	}

	@Override
	public Vet save(Vet vet) {
		return super.save(vet.getId(), vet);
	}

	@Override
	public void delete(Vet vet) {
		super.delete(vet);
	}

	@Override
	public void deleteByID(Long id) {
		super.deleteByID(id);
	}
}
