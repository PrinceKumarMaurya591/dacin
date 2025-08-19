package com.dacinc.dto;

import com.dacinc.constants.PaymentMethod;

public class PaymentRequest {
    private Long dealerId;
    private Double amount;
    private PaymentMethod method;
	public Long getDealerId() {
		return dealerId;
	}
	public void setDealerId(Long dealerId) {
		this.dealerId = dealerId;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public PaymentMethod getMethod() {
		return method;
	}
	public void setMethod(PaymentMethod method) {
		this.method = method;
	}
	public PaymentRequest(Long dealerId, Double amount, PaymentMethod method) {
		super();
		this.dealerId = dealerId;
		this.amount = amount;
		this.method = method;
	}
	public PaymentRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
    
}
