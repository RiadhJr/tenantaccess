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
@Table(name = "transfer_details")
public class TransferDetails implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2028152047847679031L;
	@Id
	@GeneratedValue
	private Long id;
	private ProductVariants productVariants;
	private Products products;
	private Transfers transfers;
	private Units units;
	private double cost;
	private Double taxnet;
	private String taxMethod;
	private Double discount;
	private String discountMethod;
	private double quantity;
	private double total;
	private Date createdAt;
	private Date updatedAt;


	public TransferDetails(Long id, Products products, Transfers transfers, double cost, double quantity, double total) {
		this.id = id;
		this.products = products;
		this.transfers = transfers;
		this.cost = cost;
		this.quantity = quantity;
		this.total = total;
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
	@JoinColumn(name = "transfer_id", nullable = false)
	public Transfers getTransfers() {
		return this.transfers;
	}

	public void setTransfers(Transfers transfers) {
		this.transfers = transfers;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "purchase_unit_id")
	public Units getUnits() {
		return this.units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}

	@Column(name = "cost", nullable = false, precision = 17, scale = 17)
	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
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

	@Column(name = "quantity", nullable = false, precision = 17, scale = 17)
	public double getQuantity() {
		return this.quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	@Column(name = "total", nullable = false, precision = 17, scale = 17)
	public double getTotal() {
		return this.total;
	}

	public void setTotal(double total) {
		this.total = total;
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

}
