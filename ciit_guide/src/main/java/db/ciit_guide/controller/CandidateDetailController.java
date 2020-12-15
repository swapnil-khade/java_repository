package db.ciit_guide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import db.ciit_guide.model.CandidateDetailModel;
import db.ciit_guide.operation.CandidateDetailOperation;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST}, allowedHeaders = "*")
public class CandidateDetailController {
	
	@Autowired
	CandidateDetailOperation cdo;
	
	@GetMapping("/candidate_details")
	public List<CandidateDetailModel> getCandidateDetails(){
		return cdo.getDetails("select", 0, "na", 0, "na", 0, 0, "na", "na");
	}
	
	@GetMapping("/candidate_details/{cid}")
	public CandidateDetailModel getCandidate(@PathVariable ("cid") long cid){
		return cdo.getDetails("single", cid, "na", 0, "na", 0, 0, "na", "na").get(0);
	}
	
	@GetMapping("/candidate_delete/{cid}")
	public String candidateDelete(@PathVariable ("cid") long cid){
		cdo.candidate("Delete", cid, "na", 0, "na", 0, 0, "na", "na");
		return "Candidate deleted successfully";
	}
	
	@GetMapping("/candidate_restore/{cid}")
	public String candidateRestore(@PathVariable ("cid") long cid){
		cdo.candidate("Restore", cid, "na", 0, "na", 0, 0, "na", "na");
		return "Candidate restored successfully";
	}
	
	@PostMapping("/addCandidate")
	public String addCandidate(@RequestBody CandidateDetailModel c) {
		cdo.addCandidate("insert", c);
		return "Candidate added successfully";
	}
	
	@PutMapping("/updateCandidate")
	public String updateCandidate(@RequestBody CandidateDetailModel c) {
		cdo.addCandidate("update", c);
		return "Candidate updated successfully";
	}

}


//{													CandidateDetailModel
//"candidate_id":1,
//"candidate_name":"Dhananjay",
//"candidate_type_id":2,
//"mobile_number":845123456,
//"state_id":1,
//"city_id":2,
//"email_id":"email",
//"password":"password"
//}