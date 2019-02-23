package rakayby.spring.petclinic.services;

import rakayby.spring.petclinic.models.Owner;

public interface OwnerService extends CrudService<Owner, Long>{

	Owner findByLastName(String lastName);
}
