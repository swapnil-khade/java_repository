package db.ciit_guide.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import db.ciit_guide.model.CandidateQualificationModel;
import db.ciit_guide.operation.CandidateQualificationOperation;


@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST}, allowedHeaders = "*")
public class CandidateQualificationController {
	
	@Autowired
	CandidateQualificationOperation cqo;
	
	@GetMapping("/candidate_qualifications")
	public List<CandidateQualificationModel> getCandidateQualifications(){
		CandidateQualificationModel m=new CandidateQualificationModel(4,3,"","",2,"","",1,7);
		return cqo.getQualification("select", m);
	}
	
	@GetMapping("/candidate_qualifications/{cid}")
	public CandidateQualificationModel getCandidateByCid(@PathVariable ("cid") long cid){
		CandidateQualificationModel m=new CandidateQualificationModel(4,cid,"","",2,"","",1,7);
		return cqo.getQualification("single", m).get(0);
	}
	
	@GetMapping("/candidate_q_delete/{cid}")
	public String deleteCandidate(@PathVariable ("cid") long cid){
		CandidateQualificationModel m=new CandidateQualificationModel(4,cid,"","",2,"","",1,7);
		cqo.qualification("delete", m);
		return "record deleted successfully";
	}
	
	@GetMapping("/candidate_q_restore/{cid}")
	public String restoreCandidate(@PathVariable ("cid") long cid){
		CandidateQualificationModel m=new CandidateQualificationModel(4,cid,"","",2,"","",1,7);
		cqo.qualification("restore", m);
		return "record restored successfully";
	}
	
	@PostMapping("/add_candidate_q")
	public String addCandidate(@RequestBody CandidateQualificationModel cqm) {
		cqo.qualification("insert", cqm);
		return "record added successfully";
	}
	
	@PutMapping("/update_candidate_q")
	public String updateCandidate(@RequestBody CandidateQualificationModel cqm) {
		cqo.qualification("update", cqm);
		return "record updated successfully";
	}

}

//{
//    "candidate_qualification_id":1,
//    "candidate_id":12,
//    "passing_year":"2015",
//    "university":"Pune university",
//    "percentage":88,
//    "designation":"Income tax officer",
//    "company_name":"government",
//    "total_experience":4,
//    "flag":0
//}