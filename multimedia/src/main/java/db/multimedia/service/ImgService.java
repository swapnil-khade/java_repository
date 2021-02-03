package db.multimedia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import db.multimedia.model.ImgModel;
import db.multimedia.repository.ImgRepository;

@Service
public class ImgService {
	
	@Autowired
	private ImgRepository irepo;
	
	public List<ImgModel> getImages(int pageNo, int pageSize){
		Pageable paging=PageRequest.of(pageNo, pageSize,Sort.by("id").descending());
		Page<ImgModel> pagedResult=irepo.findAll(paging);
		
		return pagedResult.toList();
	}
	
}
