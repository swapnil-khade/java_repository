package db.ciit_guide.model;

import javax.persistence.*;

@Entity
@Table(name="tblcandidate_qualifications")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name = "getQualification", procedureName = "sp_tblcandidate_qualification",
			resultClasses = CandidateQualificationModel.class,
			parameters = {
					@StoredProcedureParameter(name="type", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="cqid", type = Long.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="cid", type = Long.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="yr", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="un", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="per", type = Integer.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="des", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="cname", type = String.class, mode = ParameterMode.IN),
					@StoredProcedureParameter(name="texp", type = Integer.class, mode = ParameterMode.IN)
			})
})

public class CandidateQualificationModel {
	
	@Id
	private long candidate_qualification_id ;
	private long candidate_id ;
	private String passing_year;
	private String university;
	private int percentage;
	private String designation;
	private String company_name;
	private int total_experience;
	private int flag;
	

	public CandidateQualificationModel() {
		super();
		// TODO Auto-generated constructor stub
	}


	public CandidateQualificationModel(long candidate_qualification_id, long candidate_id, String passing_year,
			String university, int percentage, String designation, String company_name, int total_experience,
			int flag) {
		super();
		this.candidate_qualification_id = candidate_qualification_id;
		this.candidate_id = candidate_id;
		this.passing_year = passing_year;
		this.university = university;
		this.percentage = percentage;
		this.designation = designation;
		this.company_name = company_name;
		this.total_experience = total_experience;
		this.flag = flag;
	}


	public long getCandidate_qualification_id() {
		return candidate_qualification_id;
	}


	public void setCandidate_qualification_id(long candidate_qualification_id) {
		this.candidate_qualification_id = candidate_qualification_id;
	}


	public long getCandidate_id() {
		return candidate_id;
	}


	public void setCandidate_id(long candidate_id) {
		this.candidate_id = candidate_id;
	}


	public String getPassing_year() {
		return passing_year;
	}


	public void setPassing_year(String passing_year) {
		this.passing_year = passing_year;
	}


	public String getUniversity() {
		return university;
	}


	public void setUniversity(String university) {
		this.university = university;
	}


	public int getPercentage() {
		return percentage;
	}


	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public String getCompany_name() {
		return company_name;
	}


	public void setCompany_name(String company_name) {
		this.company_name = company_name;
	}


	public int getTotal_experience() {
		return total_experience;
	}


	public void setTotal_experience(int total_experience) {
		this.total_experience = total_experience;
	}


	public int getFlag() {
		return flag;
	}


	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	

	
}
