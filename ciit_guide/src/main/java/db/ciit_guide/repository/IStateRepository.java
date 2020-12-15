package db.ciit_guide.repository;
import java.util.*;

import org.springframework.data.jpa.repository.query.Procedure;

import db.ciit_guide.model.StateModel;


public interface IStateRepository {
	@Procedure("sp_tblstates")
	List<StateModel> getStates();

}
