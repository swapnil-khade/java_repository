package db.ciit_guide.operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import org.springframework.stereotype.Repository;

import db.ciit_guide.model.CityModel;
import db.ciit_guide.repository.ICityRepository;

@Repository
public class CityOperation implements ICityRepository {
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<CityModel> getCities(long sid) {
		
		StoredProcedureQuery q=em.createNamedStoredProcedureQuery("getCities");
		q.setParameter("sid", sid);
		q.execute();
		return q.getResultList();
	}
}
