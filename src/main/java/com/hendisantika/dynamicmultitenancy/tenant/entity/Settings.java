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
@Table(name = "settings")
public class Settings implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4458361268809294557L;
	@Id
	@GeneratedValue
	private Long id;
	private Clients clients;
	private Currencies currencies;
	private Warehouses warehouses;
	private String email;
	private String companyname;
	private String companyphone;
	private String companyadress;
	private String logo;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;
	private String footer;
	private String developedBy;
	private String defaultLanguage;



	public Settings(Long id, String email, String companyname, String companyphone, String companyadress, String footer,
			String developedBy, String defaultLanguage) {
		this.id = id;
		this.email = email;
		this.companyname = companyname;
		this.companyphone = companyphone;
		this.companyadress = companyadress;
		this.footer = footer;
		this.developedBy = developedBy;
		this.defaultLanguage = defaultLanguage;
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
	@JoinColumn(name = "client_id")
	public Clients getClients() {
		return this.clients;
	}

	public void setClients(Clients clients) {
		this.clients = clients;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "currency_id")
	public Currencies getCurrencies() {
		return this.currencies;
	}

	public void setCurrencies(Currencies currencies) {
		this.currencies = currencies;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_id")
	public Warehouses getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Warehouses warehouses) {
		this.warehouses = warehouses;
	}

	@Column(name = "email", nullable = false, length = 191)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "companyname", nullable = false, length = 191)
	public String getCompanyname() {
		return this.companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	@Column(name = "companyphone", nullable = false, length = 191)
	public String getCompanyphone() {
		return this.companyphone;
	}

	public void setCompanyphone(String companyphone) {
		this.companyphone = companyphone;
	}

	@Column(name = "companyadress", nullable = false, length = 191)
	public String getCompanyadress() {
		return this.companyadress;
	}

	public void setCompanyadress(String companyadress) {
		this.companyadress = companyadress;
	}

	@Column(name = "logo", length = 191)
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
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

	@Column(name = "footer", nullable = false, length = 192)
	public String getFooter() {
		return this.footer;
	}

	public void setFooter(String footer) {
		this.footer = footer;
	}

	@Column(name = "developed_by", nullable = false, length = 192)
	public String getDevelopedBy() {
		return this.developedBy;
	}

	public void setDevelopedBy(String developedBy) {
		this.developedBy = developedBy;
	}

	@Column(name = "default_language", nullable = false, length = 192)
	public String getDefaultLanguage() {
		return this.defaultLanguage;
	}

	public void setDefaultLanguage(String defaultLanguage) {
		this.defaultLanguage = defaultLanguage;
	}

}
