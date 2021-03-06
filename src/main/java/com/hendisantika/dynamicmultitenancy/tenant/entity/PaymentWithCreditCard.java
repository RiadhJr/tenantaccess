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
@Table(name = "payment_with_credit_card")
public class PaymentWithCreditCard implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4628149441158283345L;
	@Id
	@GeneratedValue
	private Long id;
	private Long paymentId;
	private Long customerId;
	private String customerStripeId;
	private String chargeId;
	private Date createdAt;
	private Date updatedAt;


	public PaymentWithCreditCard(Long id, Long paymentId, Long customerId, String customerStripeId, String chargeId) {
		this.id = id;
		this.paymentId = paymentId;
		this.customerId = customerId;
		this.customerStripeId = customerStripeId;
		this.chargeId = chargeId;
	}


	@Id

	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "payment_id", nullable = false)
	public Long getPaymentId() {
		return this.paymentId;
	}

	public void setPaymentId(Long paymentId) {
		this.paymentId = paymentId;
	}

	@Column(name = "customer_id", nullable = false)
	public Long getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	@Column(name = "customer_stripe_id", nullable = false, length = 192)
	public String getCustomerStripeId() {
		return this.customerStripeId;
	}

	public void setCustomerStripeId(String customerStripeId) {
		this.customerStripeId = customerStripeId;
	}

	@Column(name = "charge_id", nullable = false, length = 192)
	public String getChargeId() {
		return this.chargeId;
	}

	public void setChargeId(String chargeId) {
		this.chargeId = chargeId;
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
