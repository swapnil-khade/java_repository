package db.ciit_guide.operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Repository;

import db.ciit_guide.model.StateModel;
import db.ciit_guide.repository.IStateRepository;

@Repository
public class StateOperation implements IStateRepository{

	@PersistenceContext
	private EntityManager em;
		
	@SuppressWarnings("unchecked")
	@Override
	public List<StateModel> getStates() {
		
		StoredProcedureQuery q=em.createNamedStoredProcedureQuery("getStates");
		return q.getResultList();
	} 
	
	

}
