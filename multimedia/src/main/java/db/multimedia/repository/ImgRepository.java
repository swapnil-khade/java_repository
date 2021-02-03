package db.multimedia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import db.multimedia.model.ImgModel;

public interface ImgRepository extends PagingAndSortingRepository<ImgModel, Long>{

}
