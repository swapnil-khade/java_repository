package db.ciit_guide.repository;

import org.springframework.data.repository.CrudRepository;

import db.ciit_guide.model.CourseModel;

public interface ICourseRepository extends CrudRepository<CourseModel, Integer>{

}
