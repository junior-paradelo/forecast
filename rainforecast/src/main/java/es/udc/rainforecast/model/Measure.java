package es.udc.rainforecast.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "measure")
public class Measure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "pluviometer_id", nullable = false)
	private int pluviometerId;
	private int time;
	private int value;

	public Measure() {
	}

	public Measure(int id, int pluviometerId, int time, int value) {
		this.id = id;
		this.pluviometerId = pluviometerId;
		this.time = time;
		this.value = value;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPluviometerId() {
		return pluviometerId;
	}

	public void setPluviometerId(int pluviometerId) {
		this.pluviometerId = pluviometerId;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

}
