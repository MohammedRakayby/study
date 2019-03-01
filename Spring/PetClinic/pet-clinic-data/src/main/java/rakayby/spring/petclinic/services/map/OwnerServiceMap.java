package rakayby.spring.petclinic.services.map;

import java.util.Set;

import rakayby.spring.petclinic.models.Owner;
import rakayby.spring.petclinic.services.CrudService;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements CrudService<Owner, Long>{
	
	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	@Override
	public Owner findByID(Long id) {
		return super.findByID(id);
	}

	@Override
	public Owner save(Owner owner) {
		return super.save(owner.getId(), owner);
	}

	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

	@Override
	public void deleteByID(Long id) {
		super.deleteByID(id);
	}
	
	
}
