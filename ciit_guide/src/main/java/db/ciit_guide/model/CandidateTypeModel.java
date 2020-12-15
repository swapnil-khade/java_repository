package db.ciit_guide.model;

import javax.persistence.*;

@Entity
@Table(name="tblcandidate_types")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="getCandidateType", procedureName = "sp_tblcandidate_types", resultClasses = CandidateTypeModel.class,
			parameters = {
					@StoredProcedureParameter(name="type", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="ctid", type = Long.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="ctype", type = String.class, mode = ParameterMode.IN)
			})
})
public class CandidateTypeModel {
	@Id
	private long candidate_type_id;
	private String candidate_type;
	
	public CandidateTypeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateTypeModel(long candidate_type_id, String candidate_type) {
		super();
		this.candidate_type_id = candidate_type_id;
		this.candidate_type = candidate_type;
	}

	public long getCandidate_type_id() {
		return candidate_type_id;
	}

	public void setCandidate_type_id(long candidate_type_id) {
		this.candidate_type_id = candidate_type_id;
	}

	public String getCandidate_type() {
		return candidate_type;
	}

	public void setCandidate_type(String candidate_type) {
		this.candidate_type = candidate_type;
	}
	
	

}
