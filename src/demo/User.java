package demo;public class User {	String name;	String phone;	public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public String getPhone() {		return phone;	}	public void setPhone(String phone) {		this.phone = phone;	}	@Override	public String toString() {		return "User [name=" + name + ", phone=" + phone + "]";	}	}