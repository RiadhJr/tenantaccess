package com.hendisantika.dynamicmultitenancy.tenant.entity;
// Generated 23 avr. 2022, 13:09:37 by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
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

/**
 * ProductVariants generated by hbm2java
 */
@Entity
@Table(name = "product_variants")
public class ProductVariants implements java.io.Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = 8126816034547961721L;
	@Id
	@GeneratedValue
	private Long id;
	private Products products;
	private String name;
	private BigDecimal qty;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	@JsonIgnore
	private Set<PurchaseReturnDetails> purchaseReturnDetailses = new HashSet<PurchaseReturnDetails>(0);
	@JsonIgnore
	private Set<SaleReturnDetails> saleReturnDetailses = new HashSet<SaleReturnDetails>(0);
	@JsonIgnore
	private Set<AdjustmentDetails> adjustmentDetailses = new HashSet<AdjustmentDetails>(0);
	@JsonIgnore
	private Set<SaleDetails> saleDetailses = new HashSet<SaleDetails>(0);
	@JsonIgnore
	private Set<QuotationDetails> quotationDetailses = new HashSet<QuotationDetails>(0);
	@JsonIgnore
	private Set<ProductWarehouse> productWarehouses = new HashSet<ProductWarehouse>(0);
	@JsonIgnore
	private Set<PurchaseDetails> purchaseDetailses = new HashSet<PurchaseDetails>(0);
	@JsonIgnore
	private Set<TransferDetails> transferDetailses = new HashSet<TransferDetails>(0);

	public ProductVariants() {
	}

	public ProductVariants(Long id) {
		this.id = id;
	}

	public ProductVariants(Long id, Products products, String name, BigDecimal qty, Date createdAt, Date updatedAt,
			Date deletedAt, Set<PurchaseReturnDetails> purchaseReturnDetailses,
			Set<SaleReturnDetails> saleReturnDetailses, Set<AdjustmentDetails> adjustmentDetailses,
			Set<SaleDetails> saleDetailses, Set<QuotationDetails> quotationDetailses,
			Set<ProductWarehouse> productWarehouses, Set<PurchaseDetails> purchaseDetailses,
			Set<TransferDetails> transferDetailses) {
		this.id = id;
		this.products = products;
		this.name = name;
		this.qty = qty;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
		this.purchaseReturnDetailses = purchaseReturnDetailses;
		this.saleReturnDetailses = saleReturnDetailses;
		this.adjustmentDetailses = adjustmentDetailses;
		this.saleDetailses = saleDetailses;
		this.quotationDetailses = quotationDetailses;
		this.productWarehouses = productWarehouses;
		this.purchaseDetailses = purchaseDetailses;
		this.transferDetailses = transferDetailses;
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
	@JoinColumn(name = "product_id")
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	@Column(name = "name", length = 192)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "qty", precision = 8)
	public BigDecimal getQty() {
		return this.qty;
	}

	public void setQty(BigDecimal qty) {
		this.qty = qty;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productVariants")
	public Set<PurchaseReturnDetails> getPurchaseReturnDetailses() {
		return this.purchaseReturnDetailses;
	}

	public void setPurchaseReturnDetailses(Set<PurchaseReturnDetails> purchaseReturnDetailses) {
		this.purchaseReturnDetailses = purchaseReturnDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productVariants")
	public Set<SaleReturnDetails> getSaleReturnDetailses() {
		return this.saleReturnDetailses;
	}

	public void setSaleReturnDetailses(Set<SaleReturnDetails> saleReturnDetailses) {
		this.saleReturnDetailses = saleReturnDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productVariants")
	public Set<AdjustmentDetails> getAdjustmentDetailses() {
		return this.adjustmentDetailses;
	}

	public void setAdjustmentDetailses(Set<AdjustmentDetails> adjustmentDetailses) {
		this.adjustmentDetailses = adjustmentDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productVariants")
	public Set<SaleDetails> getSaleDetailses() {
		return this.saleDetailses;
	}

	public void setSaleDetailses(Set<SaleDetails> saleDetailses) {
		this.saleDetailses = saleDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productVariants")
	public Set<QuotationDetails> getQuotationDetailses() {
		return this.quotationDetailses;
	}

	public void setQuotationDetailses(Set<QuotationDetails> quotationDetailses) {
		this.quotationDetailses = quotationDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productVariants")
	public Set<ProductWarehouse> getProductWarehouses() {
		return this.productWarehouses;
	}

	public void setProductWarehouses(Set<ProductWarehouse> productWarehouses) {
		this.productWarehouses = productWarehouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productVariants")
	public Set<PurchaseDetails> getPurchaseDetailses() {
		return this.purchaseDetailses;
	}

	public void setPurchaseDetailses(Set<PurchaseDetails> purchaseDetailses) {
		this.purchaseDetailses = purchaseDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productVariants")
	public Set<TransferDetails> getTransferDetailses() {
		return this.transferDetailses;
	}

	public void setTransferDetailses(Set<TransferDetails> transferDetailses) {
		this.transferDetailses = transferDetailses;
	}

}
