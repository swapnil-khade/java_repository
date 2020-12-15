package db.ciit_guide.repository;



import java.util.List;
import org.springframework.data.jpa.repository.query.Procedure;
import db.ciit_guide.model.CandidateDetailModel;

public interface ICandidateDetailRepository{
	@Procedure("sp_tblcandidate_details")
	List<CandidateDetailModel> getDetails(String type,long cid,String name,long ctid,String num,
										  long sid,long cityid,String eid,String pass);
	
	@Procedure("sp_tblcandidate_details")
	void candidate(String type,long cid,String name,long ctid,String num, 
				   long sid,long cityid,String eid,String pass);
	
	@Procedure("sp_tblcandidate_details")
	void addCandidate(String type, CandidateDetailModel c);
}
