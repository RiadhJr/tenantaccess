package com.hendisantika.dynamicmultitenancy.tenant.entity;


import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
@Table(name = "pos_settings")
public class PosSettings implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1621513181288424086L;
	@Id
	@GeneratedValue
	private Long id;
	private String noteCustomer;
	private short showNote;
	private short showBarcode;
	private short showDiscount;
	private short showCustomer;
	private short showEmail;
	private short showPhone;
	private short showAddress;
	private Date createdAt;
	private Date updatedAt;
	private Date deletedAt;


	
	public PosSettings(Long id, String noteCustomer, short showNote, short showBarcode, short showDiscount,
			short showCustomer, short showEmail, short showPhone, short showAddress) {
		this.id = id;
		this.noteCustomer = noteCustomer;
		this.showNote = showNote;
		this.showBarcode = showBarcode;
		this.showDiscount = showDiscount;
		this.showCustomer = showCustomer;
		this.showEmail = showEmail;
		this.showPhone = showPhone;
		this.showAddress = showAddress;
	}


	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "note_customer", nullable = false, length = 192)
	public String getNoteCustomer() {
		return this.noteCustomer;
	}

	public void setNoteCustomer(String noteCustomer) {
		this.noteCustomer = noteCustomer;
	}

	@Column(name = "show_note", nullable = false)
	public short getShowNote() {
		return this.showNote;
	}

	public void setShowNote(short showNote) {
		this.showNote = showNote;
	}

	@Column(name = "show_barcode", nullable = false)
	public short getShowBarcode() {
		return this.showBarcode;
	}

	public void setShowBarcode(short showBarcode) {
		this.showBarcode = showBarcode;
	}

	@Column(name = "show_discount", nullable = false)
	public short getShowDiscount() {
		return this.showDiscount;
	}

	public void setShowDiscount(short showDiscount) {
		this.showDiscount = showDiscount;
	}

	@Column(name = "show_customer", nullable = false)
	public short getShowCustomer() {
		return this.showCustomer;
	}

	public void setShowCustomer(short showCustomer) {
		this.showCustomer = showCustomer;
	}

	@Column(name = "show_email", nullable = false)
	public short getShowEmail() {
		return this.showEmail;
	}

	public void setShowEmail(short showEmail) {
		this.showEmail = showEmail;
	}

	@Column(name = "show_phone", nullable = false)
	public short getShowPhone() {
		return this.showPhone;
	}

	public void setShowPhone(short showPhone) {
		this.showPhone = showPhone;
	}

	@Column(name = "show_address", nullable = false)
	public short getShowAddress() {
		return this.showAddress;
	}

	public void setShowAddress(short showAddress) {
		this.showAddress = showAddress;
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
