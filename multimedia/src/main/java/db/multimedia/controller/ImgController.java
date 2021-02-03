package db.multimedia.controller;

import java.io.IOException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import db.multimedia.model.ImgModel;
import db.multimedia.repository.ImgRepository;
import db.multimedia.service.ImgService;

import java.util.*;

@RestController
@CrossOrigin(origins = "*", methods = {RequestMethod.GET,RequestMethod.POST}, allowedHeaders = "*")
public class ImgController {
	
	@Autowired
	ImgRepository irepo;
	
	@Autowired
	private ImgService imgService;
	
	@GetMapping("/demo")
	public String display() {
		return "welcome!";
	}
	
	
	@PostMapping("/upload")
	public String upload(@RequestParam("file") MultipartFile file, ImgModel im) throws IOException {
		System.out.println("file size="+file.getBytes().length+" "+file.getOriginalFilename()+" "+file.getBytes());
		System.out.println("file name="+im.getName());
		
		ImgModel img= new ImgModel(im.getName(), file.getBytes(), file.getContentType());
		irepo.save(img);

		return "success";
	}
	
	@GetMapping("/display/{pageNo}/{pageSize}")
	public List<ImgModel> getImages(@PathVariable int pageNo, @PathVariable int pageSize){
		return imgService.getImages(pageNo, pageSize);
	}
}
