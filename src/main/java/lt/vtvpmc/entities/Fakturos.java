package lt.vtvpmc.entities;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fakturos implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private long number;
	private String date;
	private String company;
	private String client;
	
	public Fakturos() {
	}
	
	public Fakturos(String date, String company, String client) {
		
		this.date = date;
		this.company = company;
		this.client = client;
	}
	
	public long getNumber() {
		return number;
	}
	public void setNumber(long number) {
		this.number = number;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCompanyName() {
		return company;
	}
	public void setCompanyName(String company) {
		this.company = company;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	
	

}
