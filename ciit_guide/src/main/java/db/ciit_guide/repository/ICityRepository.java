package db.ciit_guide.repository;

import java.util.List;

import org.springframework.data.jpa.repository.query.Procedure;

import db.ciit_guide.model.CityModel;

public interface ICityRepository {
	@Procedure("sp_tblcities")
	List<CityModel> getCities(long sid);

}
