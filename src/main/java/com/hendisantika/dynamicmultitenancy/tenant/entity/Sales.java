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
@Table(name = "sales")
public class Sales implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5956508887191180919L;
	@Id
	@GeneratedValue
	private Long id;
	private Clients clients;
	private Users users;
	private Warehouses warehouses;
	private Date date;
	private String ref;
	private Short isPos;
	private Double taxRate;
	private Double taxnet;
	private Double discount;
	private Double shipping;
	private double grandtotal;
	private double paidAmount;
	private String paymentStatut;
	private String statut;
	private String notes;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	@JsonIgnore
	private Set<SaleDetails> saleDetailses = new HashSet<SaleDetails>(0);
	@JsonIgnore
	private Set<PaymentSales> paymentSaleses = new HashSet<PaymentSales>(0);


	public Sales(Long id, Clients clients, Users users, Warehouses warehouses, Date date, String ref, double grandtotal,
			double paidAmount, String paymentStatut, String statut) {
		this.id = id;
		this.clients = clients;
		this.users = users;
		this.warehouses = warehouses;
		this.date = date;
		this.ref = ref;
		this.grandtotal = grandtotal;
		this.paidAmount = paidAmount;
		this.paymentStatut = paymentStatut;
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
	@JoinColumn(name = "client_id", nullable = false)
	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
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
	@JoinColumn(name = "warehouse_id", nullable = false)
	public Warehouses getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Warehouses warehouses) {
		this.warehouses = warehouses;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 13)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Column(name = "ref", nullable = false, length = 192)
	public String getRef() {
		return this.ref;
	}

	public void setRef(String ref) {
		this.ref = ref;
	}

	@Column(name = "is_pos")
	public Short getIsPos() {
		return this.isPos;
	}

	public void setIsPos(Short isPos) {
		this.isPos = isPos;
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

	@Column(name = "paid_amount", nullable = false, precision = 17, scale = 17)
	public double getPaidAmount() {
		return this.paidAmount;
	}

	public void setPaidAmount(double paidAmount) {
		this.paidAmount = paidAmount;
	}

	@Column(name = "payment_statut", nullable = false, length = 192)
	public String getPaymentStatut() {
		return this.paymentStatut;
	}

	public void setPaymentStatut(String paymentStatut) {
		this.paymentStatut = paymentStatut;
	}

	@Column(name = "statut", nullable = false, length = 191)
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sales")
	public Set<SaleDetails> getSaleDetailses() {
		return this.saleDetailses;
	}

	public void setSaleDetailses(Set<SaleDetails> saleDetailses) {
		this.saleDetailses = saleDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sales")
	public Set<PaymentSales> getPaymentSaleses() {
		return this.paymentSaleses;
	}

	public void setPaymentSaleses(Set<PaymentSales> paymentSaleses) {
		this.paymentSaleses = paymentSaleses;
	}

}
