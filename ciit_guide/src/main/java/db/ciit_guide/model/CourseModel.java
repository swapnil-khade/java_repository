package db.ciit_guide.model;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="tblcourse")
public class CourseModel {
	@Id
	private int course_id;
	private String course_name;
	
	@OneToMany(mappedBy ="tblcourse", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<ModuleModel> modules;

	public CourseModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public CourseModel(int course_id, String course_name) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
	}



	public CourseModel(int course_id, String course_name, Set<ModuleModel> modules) {
		super();
		this.course_id = course_id;
		this.course_name = course_name;
		this.modules = modules;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public String getCourse_name() {
		return course_name;
	}

	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}

	public Set<ModuleModel> getModules() {
		return modules;
	}

	public void setModules(Set<ModuleModel> modules) {
		this.modules = modules;
	}
	
	
	
	

}
