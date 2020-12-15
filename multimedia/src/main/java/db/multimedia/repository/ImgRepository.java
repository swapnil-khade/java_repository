package db.multimedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import db.multimedia.model.ImgModel;

public interface ImgRepository extends JpaRepository<ImgModel, Long>{

}
