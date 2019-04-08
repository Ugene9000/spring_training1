import lombok.ToString;

@ToString
public class Address {

	private String street;
	private String postcode;

	public Address(String street, String postcode) {
		this.street = street;
		this.postcode = postcode;
	}

	public Address() {}
}
