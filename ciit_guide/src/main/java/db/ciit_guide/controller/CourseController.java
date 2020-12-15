package db.ciit_guide.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

import db.ciit_guide.model.CourseModel;
import db.ciit_guide.model.ModuleModel;
import db.ciit_guide.repository.ICourseRepository;
import db.ciit_guide.repository.IModuleRepository;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST}, allowedHeaders = "*")
public class CourseController {
	
	@Autowired
	ICourseRepository crepo;
	@Autowired
	IModuleRepository mrepo;
		
	@PostMapping("/course")
	public String addCourse(@RequestBody CourseModel cm) {
		CourseModel c=new CourseModel(cm.getCourse_id(), cm.getCourse_name());
		crepo.save(c);
		
		Set<ModuleModel> mModel=cm.getModules();
		for(ModuleModel temp:mModel) {
			mrepo.save(new ModuleModel(temp.getModule_name(), c));
		}
		return "Course added successfully";
	}

	@GetMapping("/courses")
	public List<CourseModel> getCourses(){
				
		List<CourseModel>lstcourses=new ArrayList<>();
		List<CourseModel>lst=(List<CourseModel>)crepo.findAll();
		 
		for(CourseModel c : lst) {
			 
			 Set<ModuleModel>mmlst=new HashSet<>();
			 
			 for(ModuleModel m :c.getModules()) {
				 mmlst.add(new ModuleModel(m.getModule_id(),m.getModule_name()));
				 
			 }		 
			 
			 CourseModel cm=new  CourseModel(c.getCourse_id(),c.getCourse_name(),mmlst);
			 lstcourses.add(cm);
		}
		return lstcourses;
	}
	
	@GetMapping("/courses/{id}")
	public CourseModel getCourseById(@PathVariable int id){
		
		CourseModel lst= crepo.findById(id).get();
				 
			 Set<ModuleModel>mmlst=new HashSet<>();
			 for(ModuleModel m :lst.getModules()) {
				 mmlst.add(new ModuleModel(m.getModule_id(),m.getModule_name()));
			 }		 
			 CourseModel cm=new  CourseModel(lst.getCourse_id(),lst.getCourse_name(),mmlst);					 
		return cm;
	}

}

//{
//    "course_id":4,
//    "course_name":"php",
//    "modules":[
//        {"module_name":"php concepts"},
//        {"module_name":"php concepts 2"}
//    ]
//}