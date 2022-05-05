package com.hendisantika.dynamicmultitenancy.tenant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Getter
@Setter
@Entity
@Table(name = "migrations")
public class Migrations implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7116311728350737735L;
	@Id
	@GeneratedValue
	private Long id;
	private String migration;
	private Long batch;



	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "migration", nullable = false, length = 191)
	public String getMigration() {
		return this.migration;
	}

	public void setMigration(String migration) {
		this.migration = migration;
	}

	@Column(name = "batch", nullable = false)
	public Long getBatch() {
		return this.batch;
	}

	public void setBatch(Long batch) {
		this.batch = batch;
	}

}
