package net.codejava.spring.model.dto;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
public class NewXmlEntity implements Serializable {

	public NewXmlEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	private static final long serialVersionUID = 1L;
	
	@XmlElement
	private Long id;
	
	@XmlElement
	private String username;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}
