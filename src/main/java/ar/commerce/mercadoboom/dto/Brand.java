package ar.commerce.mercadoboom.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Brand implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	Long id;
	String name;
	Integer code;
	
	
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
	
	
	public Integer getCode() {
	
		return code;
	}
	
	
	public void setCode(Integer code) {
	
		this.code = code;
	}
	
	
}
