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
@Table(name = "units")
public class Units implements java.io.Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3080943953799232697L;
	@Id
	@GeneratedValue
	private Long id;
	private Units units;
	private String name;
	private String shortname;
	private String operator;
	private Double operatorValue;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	@JsonIgnore
	private Set<Products> productsesForUnitPurchaseId = new HashSet<Products>(0);
	@JsonIgnore
	private Set<PurchaseDetails> purchaseDetailses = new HashSet<PurchaseDetails>(0);
	@JsonIgnore
	private Set<QuotationDetails> quotationDetailses = new HashSet<QuotationDetails>(0);
	@JsonIgnore
	private Set<Products> productsesForUnitSaleId = new HashSet<Products>(0);
	@JsonIgnore
	private Set<SaleDetails> saleDetailses = new HashSet<SaleDetails>(0);
	@JsonIgnore
	private Set<PurchaseReturnDetails> purchaseReturnDetailses = new HashSet<PurchaseReturnDetails>(0);
	@JsonIgnore
	private Set<Products> productsesForUnitId = new HashSet<Products>(0);
	@JsonIgnore
	private Set<SaleReturnDetails> saleReturnDetailses = new HashSet<SaleReturnDetails>(0);
	@JsonIgnore
	private Set<TransferDetails> transferDetailses = new HashSet<TransferDetails>(0);
	@JsonIgnore
	private Set<Units> unitses = new HashSet<Units>(0);



	public Units(Long id, String name, String shortname) {
		this.id = id;
		this.name = name;
		this.shortname = shortname;
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
	@JoinColumn(name = "base_unit")
	public Units getUnits() {
		return this.units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	@Column(name = "name", nullable = false, length = 192)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "shortname", nullable = false, length = 192)
	public String getShortname() {
		return this.shortname;
	}

	public void setShortname(String shortname) {
		this.shortname = shortname;
	}

	@Column(name = "operator", length = 192)
	public String getOperator() {
		return this.operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	@Column(name = "operator_value", precision = 17, scale = 17)
	public Double getOperatorValue() {
		return this.operatorValue;
	}

	public void setOperatorValue(Double operatorValue) {
		this.operatorValue = operatorValue;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unitsByUnitPurchaseId")
	public Set<Products> getProductsesForUnitPurchaseId() {
		return this.productsesForUnitPurchaseId;
	}

	public void setProductsesForUnitPurchaseId(Set<Products> productsesForUnitPurchaseId) {
		this.productsesForUnitPurchaseId = productsesForUnitPurchaseId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "units")
	public Set<PurchaseDetails> getPurchaseDetailses() {
		return this.purchaseDetailses;
	}

	public void setPurchaseDetailses(Set<PurchaseDetails> purchaseDetailses) {
		this.purchaseDetailses = purchaseDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "units")
	public Set<QuotationDetails> getQuotationDetailses() {
		return this.quotationDetailses;
	}

	public void setQuotationDetailses(Set<QuotationDetails> quotationDetailses) {
		this.quotationDetailses = quotationDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unitsByUnitSaleId")
	public Set<Products> getProductsesForUnitSaleId() {
		return this.productsesForUnitSaleId;
	}

	public void setProductsesForUnitSaleId(Set<Products> productsesForUnitSaleId) {
		this.productsesForUnitSaleId = productsesForUnitSaleId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "units")
	public Set<SaleDetails> getSaleDetailses() {
		return this.saleDetailses;
	}

	public void setSaleDetailses(Set<SaleDetails> saleDetailses) {
		this.saleDetailses = saleDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "units")
	public Set<PurchaseReturnDetails> getPurchaseReturnDetailses() {
		return this.purchaseReturnDetailses;
	}

	public void setPurchaseReturnDetailses(Set<PurchaseReturnDetails> purchaseReturnDetailses) {
		this.purchaseReturnDetailses = purchaseReturnDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "unitsByUnitId")
	public Set<Products> getProductsesForUnitId() {
		return this.productsesForUnitId;
	}

	public void setProductsesForUnitId(Set<Products> productsesForUnitId) {
		this.productsesForUnitId = productsesForUnitId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "units")
	public Set<SaleReturnDetails> getSaleReturnDetailses() {
		return this.saleReturnDetailses;
	}

	public void setSaleReturnDetailses(Set<SaleReturnDetails> saleReturnDetailses) {
		this.saleReturnDetailses = saleReturnDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "units")
	public Set<TransferDetails> getTransferDetailses() {
		return this.transferDetailses;
	}

	public void setTransferDetailses(Set<TransferDetails> transferDetailses) {
		this.transferDetailses = transferDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "units")
	public Set<Units> getUnitses() {
		return this.unitses;
	}

	public void setUnitses(Set<Units> unitses) {
		this.unitses = unitses;
	}

}
