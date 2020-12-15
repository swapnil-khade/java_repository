package db.ciit_guide.operation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

import db.ciit_guide.model.CandidateQualificationModel;
import db.ciit_guide.repository.ICandidateQualificationRepository;

@Repository
public class CandidateQualificationOperation implements ICandidateQualificationRepository{
	
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Override
	public List<CandidateQualificationModel> getQualification(String type, CandidateQualificationModel cqm) {
		
		StoredProcedureQuery q=em.createNamedStoredProcedureQuery("getQualification");
		q.setParameter("type", type);
		q.setParameter("cqid", cqm.getCandidate_qualification_id());
		q.setParameter("cid", cqm.getCandidate_id());
		q.setParameter("yr", cqm.getPassing_year());
		q.setParameter("un", cqm.getUniversity());
		q.setParameter("per", cqm.getPercentage());
		q.setParameter("des", cqm.getDesignation());
		q.setParameter("cname", cqm.getCompany_name());
		q.setParameter("texp", cqm.getTotal_experience());
		return q.getResultList();		
	}

	@Override
	public void qualification(String type, CandidateQualificationModel cqm) {
		StoredProcedureQuery q=em.createNamedStoredProcedureQuery("getQualification");
		q.setParameter("type", type);
		q.setParameter("cqid", cqm.getCandidate_qualification_id());
		q.setParameter("cid", cqm.getCandidate_id());
		q.setParameter("yr", cqm.getPassing_year());
		q.setParameter("un", cqm.getUniversity());
		q.setParameter("per", cqm.getPercentage());
		q.setParameter("des", cqm.getDesignation());
		q.setParameter("cname", cqm.getCompany_name());
		q.setParameter("texp", cqm.getTotal_experience());
		q.execute();
	}
}
