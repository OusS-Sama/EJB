package metier.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Position
 *
 */
@Entity

public class Position implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double latitude;
	private double longitude;
	private Date Date;
	private static final long serialVersionUID = 1L;
	@Transient 
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="id_smartphone")
	private Smartphone smartphone;

	public Position() {
		super();
	}   
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	public double getLatitude() {
		return this.latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}   
	public Smartphone getSmartphone() {
		return smartphone;
	}
	public void setSmartphone(Smartphone smartphone) {
		this.smartphone = smartphone;
	}
	public double getLongitude() {
		return this.longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}   
	public Date getDate() {
		return this.Date;
	}

	public void setDate(Date Date) {
		this.Date = Date;
	}
   
}
