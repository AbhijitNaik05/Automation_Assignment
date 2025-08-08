package com.pojo;

public class AddressPojo {

	private String company;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String postalCode;
	private String homePhoneNumber;
	private String mobileNumber;
	private String otherInformation;
	private String addressAlias;
	private String state;

	public String getCompany() {
		return company;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public String getCity() {
		return city;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public String getHomePhoneNumber() {
		return homePhoneNumber;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public String getOtherInformation() {
		return otherInformation;
	}

	public String getAddressAlias() {
		return addressAlias;
	}

	public String getState() {
		return state;
	}

	public AddressPojo(String company, String addressLine1, String addressLine2, String city, String postalCode,
			String homePhoneNumber, String mobileNumber, String otherInformation, String addressAlias, String state) {
		super();
		this.company = company;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.postalCode = postalCode;
		this.homePhoneNumber = homePhoneNumber;
		this.mobileNumber = mobileNumber;
		this.otherInformation = otherInformation;
		this.addressAlias = addressAlias;
		this.state = state;
	}

	@Override
	public String toString() {
		return "AddressPojo [company=" + company + ", addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2
				+ ", city=" + city + ", postalCode=" + postalCode + ", homePhoneNumber=" + homePhoneNumber
				+ ", mobileNumber=" + mobileNumber + ", otherInformation=" + otherInformation + ", addressAlias="
				+ addressAlias + ", state=" + state + "]";
	}

}
