package db.ciit_guide.model;

import javax.persistence.*;

@Entity
@Table(name="tblusers")
public class UserModel {
	
	@Id
    @Column(name="user_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String username;
    private String password;
	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserModel(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
    

}
