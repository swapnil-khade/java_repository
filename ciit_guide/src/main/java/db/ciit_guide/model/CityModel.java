package db.ciit_guide.model;

import javax.persistence.*;

@Entity
@Table(name="tblcities")
@NamedStoredProcedureQueries({
	@NamedStoredProcedureQuery(name="getCities", procedureName = "sp_tblcities", resultClasses = CityModel.class,
			parameters = {
					@StoredProcedureParameter(name="sid", type = Long.class, mode = ParameterMode.IN)
			})
})
public class CityModel {
	@Id
	private long city_id;
	private String city_name;
	private long state_id;
	private int flag;
	
	public CityModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CityModel(long city_id, String city_name, long state_id, int flag) {
		super();
		this.city_id = city_id;
		this.city_name = city_name;
		this.state_id = state_id;
		this.flag = flag;
	}

	public long getCity_id() {
		return city_id;
	}

	public void setCity_id(long city_id) {
		this.city_id = city_id;
	}

	public String getCity_name() {
		return city_name;
	}

	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}

	public long getState_id() {
		return state_id;
	}

	public void setState_id(long state_id) {
		this.state_id = state_id;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}
	
	

}
