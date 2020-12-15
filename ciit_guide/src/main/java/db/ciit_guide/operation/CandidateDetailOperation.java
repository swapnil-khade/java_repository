package db.ciit_guide.operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import db.ciit_guide.model.CandidateDetailModel;
import db.ciit_guide.repository.ICandidateDetailRepository;

@Repository
public class CandidateDetailOperation implements ICandidateDetailRepository{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<CandidateDetailModel> getDetails(String type, long cid, String name, long ctid, String num, long sid,
			long cityid, String eid, String pass) {
		
		StoredProcedureQuery q=em.createNamedStoredProcedureQuery("getDetails");
		q.setParameter("type", type);
		q.setParameter("cid", cid);
		q.setParameter("name", name);
		q.setParameter("ctid", ctid);
		q.setParameter("num", num);
		q.setParameter("sid", sid);
		q.setParameter("cityid", cityid);
		q.setParameter("eid", eid);
		q.setParameter("pass", pass);
		return q.getResultList();
	}

	@Override
	public void candidate(String type, long cid, String name, long ctid, String num, long sid,
			long cityid, String eid, String pass) {
		StoredProcedureQuery q=em.createNamedStoredProcedureQuery("getDetails");
		q.setParameter("type", type);
		q.setParameter("cid", cid);
		q.setParameter("name", name);
		q.setParameter("ctid", ctid);
		q.setParameter("num", num);
		q.setParameter("sid", sid);
		q.setParameter("cityid", cityid);
		q.setParameter("eid", eid);
		q.setParameter("pass", pass);
		q.execute();
	}

	@Override
	public void addCandidate(String type, CandidateDetailModel c) {
		StoredProcedureQuery q=em.createNamedStoredProcedureQuery("getDetails");
		q.setParameter("type", type);
		q.setParameter("cid", c.getCandidate_id());
		q.setParameter("name", c.getCandidate_name());
		q.setParameter("ctid", c.getCandidate_type_id());
		q.setParameter("num", c.getMobile_number());
		q.setParameter("sid", c.getState_id());
		q.setParameter("cityid", c.getCity_id());
		q.setParameter("eid", c.getEmail_id());
		q.setParameter("pass", c.getPassword());
		q.execute();		
	}
	

}
