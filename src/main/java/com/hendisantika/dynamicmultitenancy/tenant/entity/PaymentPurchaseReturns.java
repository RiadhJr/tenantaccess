package com.hendisantika.dynamicmultitenancy.tenant.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "payment_purchase_returns")
public class PaymentPurchaseReturns implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5916828172500602138L;
	@Id
	@GeneratedValue
	private Long id;
	private PurchaseReturns purchaseReturns;
	private Users users;
	private Date date;
	private String ref;
	private double montant;
	private double change;
	private String reglement;
	private String notes;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;


	public PaymentPurchaseReturns(Long id, PurchaseReturns purchaseReturns, Users users, Date date, String ref,
			double montant, double change, String reglement) {
		this.id = id;
		this.purchaseReturns = purchaseReturns;
		this.users = users;
		this.date = date;
		this.ref = ref;
		this.montant = montant;
		this.change = change;
		this.reglement = reglement;
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
	@JoinColumn(name = "purchase_return_id", nullable = false)
	public PurchaseReturns getPurchaseReturns() {
		return this.purchaseReturns;
	}

	public void setPurchaseReturns(PurchaseReturns purchaseReturns) {
		this.purchaseReturns = purchaseReturns;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "user_id", nullable = false)
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
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

	@Column(name = "montant", nullable = false, precision = 17, scale = 17)
	public double getMontant() {
		return this.montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Column(name = "change", nullable = false, precision = 17, scale = 17)
	public double getChange() {
		return this.change;
	}

	public void setChange(double change) {
		this.change = change;
	}

	@Column(name = "reglement", nullable = false, length = 191)
	public String getReglement() {
		return this.reglement;
	}

	public void setReglement(String reglement) {
		this.reglement = reglement;
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

}
