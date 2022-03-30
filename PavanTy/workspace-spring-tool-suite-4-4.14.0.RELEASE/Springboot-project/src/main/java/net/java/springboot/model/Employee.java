package net.java.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name="employees")

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	
	private long id;
@Column(name="comments")
	private String message;
	public Employee() {
		super();
	}
	public Employee(String message) {
		super();
		this.message = message;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", message=" + message + "]";
	}


}
