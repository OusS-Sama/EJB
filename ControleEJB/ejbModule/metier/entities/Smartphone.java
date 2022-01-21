package metier.entities;

import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Smartphone
 *
 */
@Entity

public class Smartphone implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String imei;
	private static final long serialVersionUID = 1L;
	@ManyToOne
	@JoinColumn(name="id_user")
	private User user;
	@Transient
	@OneToMany(mappedBy ="smartphone",fetch = FetchType.EAGER)
	private List<Position> position; 

	public Smartphone() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Position> getPosition() {
		return position;
	}
	public void setPosition(List<Position> position) {
		this.position = position;
	}
	public String getImei() {
		return this.imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
   
}
