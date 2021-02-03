package db.ciit_guide.operation;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import db.ciit_guide.model.StateModel;

class StateOperationTest {

	StateOperation stateOperation;
	
	@BeforeEach
	void init() {
		stateOperation=new StateOperation();
	}
	
	@Test
	void test() {
		List<StateModel> expected=stateOperation.getStates();
		List<StateModel> lst=stateOperation.getStates();
		System.out.println(lst);
	}

}
