package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the GPRODUCTS database table.
 * 
 */
@Entity
@Table(name="GPRODUCTS", schema="testdb")
@NamedQuery(name="Gproduct.findAll", query="SELECT g FROM Gproduct g")
public class Gproduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String id;

	private BigDecimal available;

	private String description;

	private int iquantity;

	private String picture;

	private String pname;

	private Double price;

	private String pusername;

	@Column(name="S_COST")
	private Double sCost;

	public Gproduct() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigDecimal getAvailable() {
		return this.available;
	}

	public void setAvailable(BigDecimal available) {
		this.available = available;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getIquantity() {
		return this.iquantity;
	}

	public void setIquantity(int iquantity) {
		this.iquantity = iquantity;
	}

	public String getPicture() {
		return this.picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getPusername() {
		return this.pusername;
	}

	public void setPusername(String pusername) {
		this.pusername = pusername;
	}

	public Double getSCost() {
		return this.sCost;
	}

	public void setSCost(Double sCost) {
		this.sCost = sCost;
	}

}