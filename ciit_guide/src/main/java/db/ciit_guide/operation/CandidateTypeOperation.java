package db.ciit_guide.operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import db.ciit_guide.model.CandidateTypeModel;
import db.ciit_guide.repository.ICandidateTypeRepository;

@Repository
public class CandidateTypeOperation implements ICandidateTypeRepository{

	@PersistenceContext
	private EntityManager em;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<CandidateTypeModel> getCandidateType(String type, long ctid, String ctype) {
		 StoredProcedureQuery q=em.createNamedStoredProcedureQuery("getCandidateType");
		 q.setParameter("type", type);
		 q.setParameter("ctid", ctid);
		 q.setParameter("ctype", ctype);
		return q.getResultList();
	}

}
