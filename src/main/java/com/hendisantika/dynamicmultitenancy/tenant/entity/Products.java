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
@Table(name = "products")
public class Products implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6724989297664418843L;
	@Id
	@GeneratedValue
	private Long id;
	private Brands brands;
	private Categories categories;
	private Units unitsByUnitPurchaseId;
	private Units unitsByUnitSaleId;
	private Units unitsByUnitId;
	private String code;
	private String typeBarcode;
	private String name;
	private double cost;
	private double price;
	private Double taxnet;
	private String taxMethod;
	private String image;
	private String note;
	private Double stockAlert;
	private short isVariant;
	private Short isActive;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	@JsonIgnore
	private Set<SaleDetails> saleDetailses = new HashSet<SaleDetails>(0);
	@JsonIgnore
	private Set<QuotationDetails> quotationDetailses = new HashSet<QuotationDetails>(0);
	@JsonIgnore
	private Set<ProductWarehouse> productWarehouses = new HashSet<ProductWarehouse>(0);
	@JsonIgnore
	private Set<PurchaseReturnDetails> purchaseReturnDetailses = new HashSet<PurchaseReturnDetails>(0);
	@JsonIgnore
	private Set<PurchaseDetails> purchaseDetailses = new HashSet<PurchaseDetails>(0);
	@JsonIgnore
	private Set<ProductVariants> productVariantses = new HashSet<ProductVariants>(0);
	@JsonIgnore
	private Set<TransferDetails> transferDetailses = new HashSet<TransferDetails>(0);
	@JsonIgnore
	private Set<SaleReturnDetails> saleReturnDetailses = new HashSet<SaleReturnDetails>(0);
	@JsonIgnore
	private Set<AdjustmentDetails> adjustmentDetailses = new HashSet<AdjustmentDetails>(0);

	public Products(Long id, Categories categories, String code, String typeBarcode, String name, double cost,
			double price, short isVariant) {
		this.id = id;
		this.categories = categories;
		this.code = code;
		this.typeBarcode = typeBarcode;
		this.name = name;
		this.cost = cost;
		this.price = price;
		this.isVariant = isVariant;
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
	@JoinColumn(name = "brand_id")
	public Brands getBrands() {
		return this.brands;
	}

	public void setBrands(Brands brands) {
		this.brands = brands;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "category_id", nullable = false)
	public Categories getCategories() {
		return this.categories;
	}

	public void setCategories(Categories categories) {
		this.categories = categories;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unit_purchase_id")
	public Units getUnitsByUnitPurchaseId() {
		return this.unitsByUnitPurchaseId;
	}

	public void setUnitsByUnitPurchaseId(Units unitsByUnitPurchaseId) {
		this.unitsByUnitPurchaseId = unitsByUnitPurchaseId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unit_sale_id")
	public Units getUnitsByUnitSaleId() {
		return this.unitsByUnitSaleId;
	}

	public void setUnitsByUnitSaleId(Units unitsByUnitSaleId) {
		this.unitsByUnitSaleId = unitsByUnitSaleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unit_id")
	public Units getUnitsByUnitId() {
		return this.unitsByUnitId;
	}

	public void setUnitsByUnitId(Units unitsByUnitId) {
		this.unitsByUnitId = unitsByUnitId;
	}

	@Column(name = "code", nullable = false, length = 192)
	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	@Column(name = "type_barcode", nullable = false, length = 192)
	public String getTypeBarcode() {
		return this.typeBarcode;
	}

	public void setTypeBarcode(String typeBarcode) {
		this.typeBarcode = typeBarcode;
	}

	@Column(name = "name", nullable = false, length = 192)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "cost", nullable = false, precision = 17, scale = 17)
	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Column(name = "price", nullable = false, precision = 17, scale = 17)
	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
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

	@Column(name = "image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "note")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Column(name = "stock_alert", precision = 17, scale = 17)
	public Double getStockAlert() {
		return this.stockAlert;
	}

	public void setStockAlert(Double stockAlert) {
		this.stockAlert = stockAlert;
	}

	@Column(name = "is_variant", nullable = false)
	public short getIsVariant() {
		return this.isVariant;
	}

	public void setIsVariant(short isVariant) {
		this.isVariant = isVariant;
	}

	@Column(name = "is_active")
	public Short getIsActive() {
		return this.isActive;
	}

	public void setIsActive(Short isActive) {
		this.isActive = isActive;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<SaleDetails> getSaleDetailses() {
		return this.saleDetailses;
	}

	public void setSaleDetailses(Set<SaleDetails> saleDetailses) {
		this.saleDetailses = saleDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<QuotationDetails> getQuotationDetailses() {
		return this.quotationDetailses;
	}

	public void setQuotationDetailses(Set<QuotationDetails> quotationDetailses) {
		this.quotationDetailses = quotationDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<ProductWarehouse> getProductWarehouses() {
		return this.productWarehouses;
	}

	public void setProductWarehouses(Set<ProductWarehouse> productWarehouses) {
		this.productWarehouses = productWarehouses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<PurchaseReturnDetails> getPurchaseReturnDetailses() {
		return this.purchaseReturnDetailses;
	}

	public void setPurchaseReturnDetailses(Set<PurchaseReturnDetails> purchaseReturnDetailses) {
		this.purchaseReturnDetailses = purchaseReturnDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<PurchaseDetails> getPurchaseDetailses() {
		return this.purchaseDetailses;
	}

	public void setPurchaseDetailses(Set<PurchaseDetails> purchaseDetailses) {
		this.purchaseDetailses = purchaseDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<ProductVariants> getProductVariantses() {
		return this.productVariantses;
	}

	public void setProductVariantses(Set<ProductVariants> productVariantses) {
		this.productVariantses = productVariantses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<TransferDetails> getTransferDetailses() {
		return this.transferDetailses;
	}

	public void setTransferDetailses(Set<TransferDetails> transferDetailses) {
		this.transferDetailses = transferDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<SaleReturnDetails> getSaleReturnDetailses() {
		return this.saleReturnDetailses;
	}

	public void setSaleReturnDetailses(Set<SaleReturnDetails> saleReturnDetailses) {
		this.saleReturnDetailses = saleReturnDetailses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "products")
	public Set<AdjustmentDetails> getAdjustmentDetailses() {
		return this.adjustmentDetailses;
	}

	public void setAdjustmentDetailses(Set<AdjustmentDetails> adjustmentDetailses) {
		this.adjustmentDetailses = adjustmentDetailses;
	}

}
