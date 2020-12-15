package db.ciit_guide.model;

import javax.persistence.*;

@Entity
@Table(name = "tblmodule")
public class ModuleModel  {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int module_id;
	private String module_name;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "course_id", nullable = false)
	private CourseModel tblcourse;

	public ModuleModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ModuleModel(String module_name, CourseModel tblcourse) {
		super();
		this.module_name = module_name;
		this.tblcourse = tblcourse;
	}

	public ModuleModel(int module_id, String module_name) {
		 this.module_id=module_id;
		this.module_name = module_name;
		 
	}

	public int getModule_id() {
		return module_id;
	}

	public void setModule_id(int module_id) {
		this.module_id = module_id;
	}

	public String getModule_name() {
		return module_name;
	}

	public void setModule_name(String module_name) {
		this.module_name = module_name;
	}

	public CourseModel getTblcourse() {
		return tblcourse;
	}

	public void setTblcourse(CourseModel tblcourse) {
		this.tblcourse = tblcourse;
	}
	
	

}
