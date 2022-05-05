package com.hendisantika.dynamicmultitenancy.tenant.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name = "users")
public class Users implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 6813709596950586847L;
	@Id
	@GeneratedValue
	private Long id;
	private String firstname;
	private String lastname;
	private String username;
	private String email;
	private String password;
	private String avatar;
	private String phone;
	private Long roleId;
	private short statut;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	@JsonIgnore
	private Set<PaymentSaleReturns> paymentSaleReturnses = new HashSet<PaymentSaleReturns>(0);
	@JsonIgnore
	private Set<Purchases> purchaseses = new HashSet<Purchases>(0);
	@JsonIgnore
	private Set<PaymentPurchases> paymentPurchaseses = new HashSet<PaymentPurchases>(0);
	@JsonIgnore
	private Set<SaleReturns> saleReturnses = new HashSet<SaleReturns>(0);
	@JsonIgnore
	private Set<ExpenseCategories> expenseCategorieses = new HashSet<ExpenseCategories>(0);
	@JsonIgnore
	private Set<PaymentPurchaseReturns> paymentPurchaseReturnses = new HashSet<PaymentPurchaseReturns>(0);
	@JsonIgnore
	private Set<Sales> saleses = new HashSet<Sales>(0);
	@JsonIgnore
	private Set<Expenses> expenseses = new HashSet<Expenses>(0);
	@JsonIgnore
	private Set<PurchaseReturns> purchaseReturnses = new HashSet<PurchaseReturns>(0);
	@JsonIgnore
	private Set<Transfers> transferses = new HashSet<Transfers>(0);
	@JsonIgnore
	private Set<RoleUser> roleUsers = new HashSet<RoleUser>(0);
	@JsonIgnore
	private Set<Adjustments> adjustmentses = new HashSet<Adjustments>(0);
	@JsonIgnore
	private Set<Quotations> quotationses = new HashSet<Quotations>(0);
	@JsonIgnore
	private Set<PaymentSales> paymentSaleses = new HashSet<PaymentSales>(0);

	public Users(Long id, String firstname, String lastname, String username, String email, String password,
			String phone, Long roleId, short statut) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.email = email;
		this.password = password;
		this.phone = phone;
		this.roleId = roleId;
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

	@Column(name = "firstname", nullable = false, length = 191)
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	@Column(name = "lastname", nullable = false, length = 191)
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	@Column(name = "username", nullable = false, length = 192)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "email", nullable = false, length = 192)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "password", nullable = false, length = 191)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "avatar", length = 191)
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "phone", nullable = false, length = 192)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "role_id", nullable = false)
	public Long getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	@Column(name = "statut", nullable = false)
	public short getStatut() {
		return this.statut;
	}

	public void setStatut(short statut) {
		this.statut = statut;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<PaymentSaleReturns> getPaymentSaleReturnses() {
		return this.paymentSaleReturnses;
	}

	public void setPaymentSaleReturnses(Set<PaymentSaleReturns> paymentSaleReturnses) {
		this.paymentSaleReturnses = paymentSaleReturnses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Purchases> getPurchaseses() {
		return this.purchaseses;
	}

	public void setPurchaseses(Set<Purchases> purchaseses) {
		this.purchaseses = purchaseses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<PaymentPurchases> getPaymentPurchaseses() {
		return this.paymentPurchaseses;
	}

	public void setPaymentPurchaseses(Set<PaymentPurchases> paymentPurchaseses) {
		this.paymentPurchaseses = paymentPurchaseses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<SaleReturns> getSaleReturnses() {
		return this.saleReturnses;
	}

	public void setSaleReturnses(Set<SaleReturns> saleReturnses) {
		this.saleReturnses = saleReturnses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<ExpenseCategories> getExpenseCategorieses() {
		return this.expenseCategorieses;
	}

	public void setExpenseCategorieses(Set<ExpenseCategories> expenseCategorieses) {
		this.expenseCategorieses = expenseCategorieses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<PaymentPurchaseReturns> getPaymentPurchaseReturnses() {
		return this.paymentPurchaseReturnses;
	}

	public void setPaymentPurchaseReturnses(Set<PaymentPurchaseReturns> paymentPurchaseReturnses) {
		this.paymentPurchaseReturnses = paymentPurchaseReturnses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Sales> getSaleses() {
		return this.saleses;
	}

	public void setSaleses(Set<Sales> saleses) {
		this.saleses = saleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Expenses> getExpenseses() {
		return this.expenseses;
	}

	public void setExpenseses(Set<Expenses> expenseses) {
		this.expenseses = expenseses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<PurchaseReturns> getPurchaseReturnses() {
		return this.purchaseReturnses;
	}

	public void setPurchaseReturnses(Set<PurchaseReturns> purchaseReturnses) {
		this.purchaseReturnses = purchaseReturnses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Transfers> getTransferses() {
		return this.transferses;
	}

	public void setTransferses(Set<Transfers> transferses) {
		this.transferses = transferses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<RoleUser> getRoleUsers() {
		return this.roleUsers;
	}

	public void setRoleUsers(Set<RoleUser> roleUsers) {
		this.roleUsers = roleUsers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Adjustments> getAdjustmentses() {
		return this.adjustmentses;
	}

	public void setAdjustmentses(Set<Adjustments> adjustmentses) {
		this.adjustmentses = adjustmentses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<Quotations> getQuotationses() {
		return this.quotationses;
	}

	public void setQuotationses(Set<Quotations> quotationses) {
		this.quotationses = quotationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "users")
	public Set<PaymentSales> getPaymentSaleses() {
		return this.paymentSaleses;
	}

	public void setPaymentSaleses(Set<PaymentSales> paymentSaleses) {
		this.paymentSaleses = paymentSaleses;
	}

}
