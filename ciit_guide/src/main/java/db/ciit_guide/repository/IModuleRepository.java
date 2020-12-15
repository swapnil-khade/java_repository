package db.ciit_guide.repository;

import org.springframework.data.repository.CrudRepository;

import db.ciit_guide.model.ModuleModel;

public interface IModuleRepository extends CrudRepository<ModuleModel, Integer>{

}
