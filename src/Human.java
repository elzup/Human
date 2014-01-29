
public class Human {
	private String firstName;
	private String lastName;
	private String middleName;

	private int sex;
	public static final int MALE = 0;
	public static final int FEMALE = 1;

	public String getFirstName () {
		return this.firstName;
	}
	public String getLastName () {
		return this.lastName;
	}
	public String getMiddleName () {
		return this.middleName;
	}
	public boolean hasMiddleName () {
		return this.middleName != null;
	}
	public static final String NAME_SEPARATER = " ";
	public String getFullName () {
		return this.firstName + NAME_SEPARATER + (this.hasMiddleName() ? this.middleName:"") + this.lastName;
	}

	public Human(String firstName, String lastName) {
	}
}
