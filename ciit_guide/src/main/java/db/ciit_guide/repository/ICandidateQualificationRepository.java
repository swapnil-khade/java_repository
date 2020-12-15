package db.ciit_guide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;

import db.ciit_guide.model.CandidateQualificationModel;

public interface ICandidateQualificationRepository{
	@Procedure("sp_tblcandidate_qualification")
	List<CandidateQualificationModel> getQualification(String type, CandidateQualificationModel q);
	
	@Procedure("sp_tblcandidate_qualification")
	void qualification(String type,CandidateQualificationModel q);

}
