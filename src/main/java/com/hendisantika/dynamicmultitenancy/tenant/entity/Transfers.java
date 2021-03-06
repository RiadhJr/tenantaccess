package com.hendisantika.dynamicmultitenancy.tenant.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;


import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "transfers")
public class Transfers implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6004712431311901017L;
	@Id
	@GeneratedValue
	private Long id;
	private Users users;
	private Warehouses warehousesByFromWarehouseId;
	private Warehouses warehousesByToWarehouseId;
	private String ref;
	private Date date;
	private double items;
	private Double taxRate;
	private Double taxnet;
	private Double discount;
	private Double shipping;
	private double grandtotal;
	private String statut;
	private String notes;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	@JsonIgnore
	private Set<TransferDetails> transferDetailses = new HashSet<TransferDetails>(0);


	public Transfers(Long id, Users users, Warehouses warehousesByFromWarehouseId, Warehouses warehousesByToWarehouseId,
			String ref, Date date, double items, double grandtotal, String statut) {
		this.id = id;
		this.users = users;
		this.warehousesByFromWarehouseId = warehousesByFromWarehouseId;
		this.warehousesByToWarehouseId = warehousesByToWarehouseId;
		this.ref = ref;
		this.date = date;
		this.items = items;
		this.grandtotal = grandtotal;
		this.statut = statut;
	}


	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "from_warehouse_id", nullable = false)
	public Warehouses getWarehousesByFromWarehouseId() {
		return this.warehousesByFromWarehouseId;
	}

	public void setWarehousesByFromWarehouseId(Warehouses warehousesByFromWarehouseId) {
		this.warehousesByFromWarehouseId = warehousesByFromWarehouseId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "to_warehouse_id", nullable = false)
	public Warehouses getWarehousesByToWarehouseId() {
		return this.warehousesByToWarehouseId;
	}

	public void setWarehousesByToWarehouseId(Warehouses warehousesByToWarehouseId) {
		this.warehousesByToWarehouseId = warehousesByToWarehouseId;
	}

	@Column(name = "ref", nullable = false, length = 192)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 13)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "items", nullable = false, precision = 17, scale = 17)
	public double getItems() {
		return this.items;
	}

	public void setItems(double items) {
		this.items = items;
	}

	@Column(name = "tax_rate", precision = 17, scale = 17)
	public Double getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(Double taxRate) {
		this.taxRate = taxRate;
	}

	@Column(name = "taxnet", precision = 17, scale = 17)
	public Double getTaxnet() {
		return this.taxnet;
	}

	public void setTaxnet(Double taxnet) {
		this.taxnet = taxnet;
	}

	@Column(name = "discount", precision = 17, scale = 17)
	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Column(name = "shipping", precision = 17, scale = 17)
	public Double getShipping() {
		return this.shipping;
	}

	public void setShipping(Double shipping) {
		this.shipping = shipping;
	}

	@Column(name = "grandtotal", nullable = false, precision = 17, scale = 17)
	public double getGrandtotal() {
		return this.grandtotal;
	}

	public void setGrandtotal(double grandtotal) {
		this.grandtotal = grandtotal;
	}

	@Column(name = "statut", nullable = false, length = 192)
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Column(name = "notes")
	public String getNotes() {
		return this.notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created_at", length = 29)
	public Date getCreatedAt() {
		return this.createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "updated_at", length = 29)
	public Date getUpdatedAt() {
		return this.updatedAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "deleted_at", length = 29)
	public Date getDeletedAt() {
		return this.deletedAt;
	}

	public void setDeletedAt(Date deletedAt) {
		this.deletedAt = deletedAt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "transfers")
	public Set<TransferDetails> getTransferDetailses() {
		return this.transferDetailses;
	}

	public void setTransferDetailses(Set<TransferDetails> transferDetailses) {
		this.transferDetailses = transferDetailses;
	}

}
