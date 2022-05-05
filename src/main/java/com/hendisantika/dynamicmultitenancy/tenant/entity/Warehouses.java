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
@Table(name = "warehouses", schema = "public")
public class Warehouses implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5971890677186428297L;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String city;
	private String mobile;
	private String zip;
	private String email;
	private String country;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	@JsonIgnore
	private Set<ProductWarehouse> productWarehouses = new HashSet<ProductWarehouse>(0);
	@JsonIgnore
	private Set<Quotations> quotationses = new HashSet<Quotations>(0);
	@JsonIgnore
	private Set<SaleReturns> saleReturnses = new HashSet<SaleReturns>(0);
	@JsonIgnore
	private Set<Transfers> transfersesForFromWarehouseId = new HashSet<Transfers>(0);
	@JsonIgnore
	private Set<Transfers> transfersesForToWarehouseId = new HashSet<Transfers>(0);
	@JsonIgnore
	private Set<Purchases> purchaseses = new HashSet<Purchases>(0);
	@JsonIgnore
	private Set<Sales> saleses = new HashSet<Sales>(0);
	@JsonIgnore
	private Set<Settings> settingses = new HashSet<Settings>(0);
	@JsonIgnore
	private Set<Expenses> expenseses = new HashSet<Expenses>(0);
	@JsonIgnore
	private Set<PurchaseReturns> purchaseReturnses = new HashSet<PurchaseReturns>(0);
	@JsonIgnore
	private Set<Adjustments> adjustmentses = new HashSet<Adjustments>(0);


	public Warehouses(Long id, String name) {
		this.id = id;
		this.name = name;
	}


	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "name", nullable = false, length = 192)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "city", length = 192)
	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Column(name = "mobile", length = 192)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "zip", length = 192)
	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	@Column(name = "email", length = 192)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "country", length = 192)
	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<ProductWarehouse> getProductWarehouses() {
		return this.productWarehouses;
	}

	public void setProductWarehouses(Set<ProductWarehouse> productWarehouses) {
		this.productWarehouses = productWarehouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<Quotations> getQuotationses() {
		return this.quotationses;
	}

	public void setQuotationses(Set<Quotations> quotationses) {
		this.quotationses = quotationses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<SaleReturns> getSaleReturnses() {
		return this.saleReturnses;
	}

	public void setSaleReturnses(Set<SaleReturns> saleReturnses) {
		this.saleReturnses = saleReturnses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehousesByFromWarehouseId")
	public Set<Transfers> getTransfersesForFromWarehouseId() {
		return this.transfersesForFromWarehouseId;
	}

	public void setTransfersesForFromWarehouseId(Set<Transfers> transfersesForFromWarehouseId) {
		this.transfersesForFromWarehouseId = transfersesForFromWarehouseId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehousesByToWarehouseId")
	public Set<Transfers> getTransfersesForToWarehouseId() {
		return this.transfersesForToWarehouseId;
	}

	public void setTransfersesForToWarehouseId(Set<Transfers> transfersesForToWarehouseId) {
		this.transfersesForToWarehouseId = transfersesForToWarehouseId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<Purchases> getPurchaseses() {
		return this.purchaseses;
	}

	public void setPurchaseses(Set<Purchases> purchaseses) {
		this.purchaseses = purchaseses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<Sales> getSaleses() {
		return this.saleses;
	}

	public void setSaleses(Set<Sales> saleses) {
		this.saleses = saleses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<Settings> getSettingses() {
		return this.settingses;
	}

	public void setSettingses(Set<Settings> settingses) {
		this.settingses = settingses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<Expenses> getExpenseses() {
		return this.expenseses;
	}

	public void setExpenseses(Set<Expenses> expenseses) {
		this.expenseses = expenseses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<PurchaseReturns> getPurchaseReturnses() {
		return this.purchaseReturnses;
	}

	public void setPurchaseReturnses(Set<PurchaseReturns> purchaseReturnses) {
		this.purchaseReturnses = purchaseReturnses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "warehouses")
	public Set<Adjustments> getAdjustmentses() {
		return this.adjustmentses;
	}

	public void setAdjustmentses(Set<Adjustments> adjustmentses) {
		this.adjustmentses = adjustmentses;
	}

}
