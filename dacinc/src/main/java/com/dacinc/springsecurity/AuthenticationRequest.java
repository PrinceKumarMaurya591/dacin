package com.dacinc.springsecurity;

import com.dacinc.constants.SubscriptionType;

public class AuthenticationRequest {
	 private String email;
	    private String password;
	    private String name;
	    private SubscriptionType subscriptionType;
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public SubscriptionType getSubscriptionType() {
			return subscriptionType;
		}
		public void setSubscriptionType(SubscriptionType subscriptionType) {
			this.subscriptionType = subscriptionType;
		}
	    
	    
	    
	}