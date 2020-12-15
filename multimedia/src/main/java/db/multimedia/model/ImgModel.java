package db.multimedia.model;

import javax.persistence.*;

@Entity
@Table(name = "image_table")
public class ImgModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	
	@Column(name = "pic_byte", length = 10000)
	private byte[] picByte;
	
	private String type;

	public ImgModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImgModel(String name, byte[] picByte, String type) {
		super();
		this.name = name;
		this.picByte = picByte;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getPicByte() {
		return picByte;
	}

	public void setPicByte(byte[] picByte) {
		this.picByte = picByte;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	
}
