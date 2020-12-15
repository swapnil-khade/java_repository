package db.ciit_guide.model;


import javax.persistence.*;

@Entity
@Table(name="tblcandidate_details")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "getDetails", procedureName = "sp_tblcandidate_details", resultClasses = CandidateDetailModel.class,
			parameters = {
					@StoredProcedureParameter(name="type", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="cid", type = Long.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="name", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="ctid", type = Long.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="num", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="sid", type = Long.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="cityid", type = Long.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="eid", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="pass", type = String.class, mode = ParameterMode.IN)					
			})
})
public class CandidateDetailModel {
	@Id
	private long candidate_id;
	private String candidate_name;
	private long candidate_type_id ;
	private String mobile_number;
	private long state_id ;
	private long city_id ;
	private String email_id;
	private String password;	
	private int flag;
	
	public CandidateDetailModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CandidateDetailModel(long candidate_id, String candidate_name, long candidate_type_id, String mobile_number,
			long state_id, long city_id, String email_id, String password, int flag) {
		super();
		this.candidate_id = candidate_id;
		this.candidate_name = candidate_name;
		this.candidate_type_id = candidate_type_id;
		this.mobile_number = mobile_number;
		this.state_id = state_id;
		this.city_id = city_id;
		this.email_id = email_id;
		this.password = password;
		this.flag = flag;
	}

	public long getCandidate_id() {
		return candidate_id;
	}

	public void setCandidate_id(long candidate_id) {
		this.candidate_id = candidate_id;
	}

	public String getCandidate_name() {
		return candidate_name;
	}

	public void setCandidate_name(String candidate_name) {
		this.candidate_name = candidate_name;
	}

	public long getCandidate_type_id() {
		return candidate_type_id;
	}

	public void setCandidate_type_id(long candidate_type_id) {
		this.candidate_type_id = candidate_type_id;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

	public long getState_id() {
		return state_id;
	}

	public void setState_id(long state_id) {
		this.state_id = state_id;
	}

	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	

}
