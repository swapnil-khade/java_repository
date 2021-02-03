package db.ciit_guide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import db.ciit_guide.model.*;
import db.ciit_guide.operation.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST}, allowedHeaders = "*")
public class BasicController implements ErrorController {
	
	@Autowired
	StateOperation so;
	@Autowired
	CityOperation co;
	@Autowired
	CandidateTypeOperation cto;
		
	private final static String path="/error";

	@RequestMapping(path)
	@ResponseBody
	@Override
	public String getErrorPath() {
		// TODO Auto-generated method stub
		return "Path not found!";
	}
	
	@GetMapping("/demo")
	public String demo() {
		return "welcome!";
	}
	
	@GetMapping("/exception")
	public void retriveUser()
	{
		throw new UserNotFoundException("Exception for id:");
		//int a=10,b=0,c;
		//c=a/b;
		
	}
	
	@GetMapping("/states")
	public List<StateModel> getStates(){
		return so.getStates();
	}
	
	@GetMapping("/cities_by_state_id/{id}")
	public List<CityModel> getCitiesByStateId(@PathVariable ("id") long sid){
		return co.getCities(sid);
	}
	
	@GetMapping("/candidate_type")
	public List<CandidateTypeModel> getCandidatetype(){
		return cto.getCandidateType("select", 0, "na");
	}

	
	
	
//	@PostMapping("/candidate")
//	public String addCandidate(@RequestBody CandidateDetailModel c) {
//		Long ctid=Long.valueOf(c.getCandidate_type_id());
//		Long stid=Long.valueOf(c.getState_id());
//		Long cityid=Long.valueOf(c.getCity_id());
//		
//		
////		CandidateDetailModel c=new CandidateDetailModel("Sahil",ctid,"23423423",stid,cityid,"email","password",0);
////		cdr.save(c);		
////		cqr.save(new CandidateQualificationModel("2015","pune",74,"designation","company name",2,0,c));
//		
//		CandidateDetailModel cdm=new CandidateDetailModel(c.getCandidate_name(),ctid,c.getMobile_number(),stid,cityid,c.getEmail_id(),c.getPassword(),0);
//		cdr.save(cdm);	
//		
//		Set <CandidateQualificationModel> cqm=c.getQualification();		
//		for(CandidateQualificationModel cq:cqm) {
//			cqr.save(new CandidateQualificationModel(cq.getPassing_year(),cq.getUniversity(),cq.getPercentage(),cq.getDesignation(),cq.getCompany_name(),cq.getTotal_experience(),0,cdm));
//		}
//		
//		return "success";
//	}
	


} 

//{
//    "candidate_name":"Sachin",
//    "candidate_type_id":2,
//    "mobile_number":845123456,
//    "state_id":1,
//    "city_id":2,
//    "email_id":"email",
//    "password":"password",
//    "flag":0,
//    "qualification":[
//        {
//            "passing_year":"2015",
//            "university":"Pune university",
//            "percentage":88,
//            "designation":"Income tax officer",
//            "company_name":"government",
//            "total_experience":4,
//            "flag":0
//         }        
//    ]
//
//}