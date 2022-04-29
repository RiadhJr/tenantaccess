package com.hendisantika.dynamicmultitenancy.tenant.entity;
// Generated 23 avr. 2022, 13:09:37 by Hibernate Tools 4.3.6.Final

import java.math.BigDecimal;
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

/**
 * PurchaseReturnDetails generated by hbm2java
 */
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "purchase_return_details", schema = "public")
public class PurchaseReturnDetails implements java.io.Serializable {

	@Id
	@GeneratedValue
	private Long id;
	private ProductVariants productVariants;
	private Products products;
	private PurchaseReturns purchaseReturns;
	private Units units;
	private BigDecimal cost;
	private Double taxnet;
	private String taxMethod;
	private Double discount;
	private String discountMethod;
	private double total;
	private double quantity;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;


	public PurchaseReturnDetails(Long id, Products products, PurchaseReturns purchaseReturns, BigDecimal cost,
			double total, double quantity) {
		this.id = id;
		this.products = products;
		this.purchaseReturns = purchaseReturns;
		this.cost = cost;
		this.total = total;
		this.quantity = quantity;
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
	@JoinColumn(name = "product_variant_id")
	public ProductVariants getProductVariants() {
		return this.productVariants;
	}

	public void setProductVariants(ProductVariants productVariants) {
		this.productVariants = productVariants;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "product_id", nullable = false)
	public Products getProducts() {
		return this.products;
	}

	public void setProducts(Products products) {
		this.products = products;
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
	@JoinColumn(name = "purchase_unit_id")
	public Units getUnits() {
		return this.units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	@Column(name = "cost", nullable = false, precision = 16, scale = 3)
	public BigDecimal getCost() {
		return this.cost;
	}

	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}

	@Column(name = "taxnet", precision = 17, scale = 17)
	public Double getTaxnet() {
		return this.taxnet;
	}

	public void setTaxnet(Double taxnet) {
		this.taxnet = taxnet;
	}

	@Column(name = "tax_method", length = 192)
	public String getTaxMethod() {
		return this.taxMethod;
	}

	public void setTaxMethod(String taxMethod) {
		this.taxMethod = taxMethod;
	}

	@Column(name = "discount", precision = 17, scale = 17)
	public Double getDiscount() {
		return this.discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	@Column(name = "discount_method", length = 192)
	public String getDiscountMethod() {
		return this.discountMethod;
	}

	public void setDiscountMethod(String discountMethod) {
		this.discountMethod = discountMethod;
	}

	@Column(name = "total", nullable = false, precision = 17, scale = 17)
	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Column(name = "quantity", nullable = false, precision = 17, scale = 17)
	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
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
