package db.ciit_guide.repository;

import java.util.List;
import org.springframework.data.jpa.repository.query.Procedure;
import db.ciit_guide.model.CandidateTypeModel;

public interface ICandidateTypeRepository {
	@Procedure("sp_tblcandidate_types")
	List<CandidateTypeModel> getCandidateType(String type, long ctid, String ctype);

}
