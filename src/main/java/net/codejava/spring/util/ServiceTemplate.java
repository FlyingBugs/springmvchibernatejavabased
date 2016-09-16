package net.codejava.spring.util;

public class ServiceTemplate {
	
	private String type;
	
	private Long value;
	
	private String msg;
	
	private Object data;
	
	public ServiceTemplate(String type, Long value, String msg, Object data) {
		super();
		this.type = type;
		this.value = value;
		this.msg = msg;
		this.data = data;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getValue() {
		return value;
	}

	public void setValue(Long value) {
		this.value = value;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
	

}
