package db.ciit_guide.model;

//import java.util.Set;

import javax.persistence.*;



@Entity
@Table(name="tblstates")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="getStates", procedureName = "sp_tblstates", resultClasses = StateModel.class)
})
public class StateModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private long state_id;
	private String state_name;
	private int flag;
//	@OneToMany(mappedBy = "tblstates", fetch = FetchType.LAZY ,cascade = {CascadeType.ALL})
//	private Set<CityModel> cities;	
//	
	
	public StateModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public StateModel(String state_name, int flag) {
		super();
		this.state_name = state_name;
		this.flag = flag;
	}
	
	public StateModel(long state_id, String state_name, int flag) {
		super();
		this.state_id = state_id;
		this.state_name = state_name;
		this.flag = flag;
	}



//	public StateModel(String state_name, int flag, Set<CityModel> cities) {
//		super();
//		this.state_name = state_name;
//		this.flag = flag;
//		this.cities = cities;
//	}



	public long getState_id() {
		return state_id;
	}

	public void setState_id(long state_id) {
		this.state_id = state_id;
	}

	public String getState_name() {
		return state_name;
	}

	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

//	public Set<CityModel> getCities() {
//		return cities;
//	}
//
//	public void setCities(Set<CityModel> cities) {
//		this.cities = cities;
//	}
	
	

}
