package com.hendisantika.dynamicmultitenancy.tenant.entity;
// Generated 23 avr. 2022, 13:09:37 by Hibernate Tools 4.3.6.Final

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

/**
 * Purchases generated by hbm2java
 */
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "purchases", schema = "public")
public class Purchases implements java.io.Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private Providers providers;
	private Users users;
	private Warehouses warehouses;
	private String ref;
	private Date date;
	private Double taxRate;
	private Double taxnet;
	private Double discount;
	private Double shipping;
	private double grandtotal;
	private double paidAmount;
	private String statut;
	private String paymentStatut;
	private String notes;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private Set<PaymentPurchases> paymentPurchaseses = new HashSet<PaymentPurchases>(0);
	private Set<PurchaseDetails> purchaseDetailses = new HashSet<PurchaseDetails>(0);


	public Purchases(Long id, Providers providers, Users users, Warehouses warehouses, String ref, Date date,
			double grandtotal, double paidAmount, String statut, String paymentStatut) {
		this.id = id;
		this.providers = providers;
		this.users = users;
		this.warehouses = warehouses;
		this.ref = ref;
		this.date = date;
		this.grandtotal = grandtotal;
		this.paidAmount = paidAmount;
		this.statut = statut;
		this.paymentStatut = paymentStatut;
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
	@JoinColumn(name = "provider_id", nullable = false)
	public Providers getProviders() {
		return this.providers;
	}

	public void setProviders(Providers providers) {
		this.providers = providers;
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

	@Column(name = "statut", nullable = false, length = 191)
	public String getStatut() {
		return this.statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

	@Column(name = "payment_statut", nullable = false, length = 192)
	public String getPaymentStatut() {
		return this.paymentStatut;
	}

	public void setPaymentStatut(String paymentStatut) {
		this.paymentStatut = paymentStatut;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchases")
	public Set<PaymentPurchases> getPaymentPurchaseses() {
		return this.paymentPurchaseses;
	}

	public void setPaymentPurchaseses(Set<PaymentPurchases> paymentPurchaseses) {
		this.paymentPurchaseses = paymentPurchaseses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "purchases")
	public Set<PurchaseDetails> getPurchaseDetailses() {
		return this.purchaseDetailses;
	}

	public void setPurchaseDetailses(Set<PurchaseDetails> purchaseDetailses) {
		this.purchaseDetailses = purchaseDetailses;
	}

}
