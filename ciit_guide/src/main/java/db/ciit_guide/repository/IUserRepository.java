package db.ciit_guide.repository;

import org.springframework.data.repository.CrudRepository;

import db.ciit_guide.model.UserModel;

public interface IUserRepository extends CrudRepository<UserModel, Long>{
	UserModel findByUsername(String username);
}