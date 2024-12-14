package student;

public class Student {
	private String FirstName,LastName,ClassYear,Major;

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getClassYear() {
		return ClassYear;
	}

	public void setClassYear(String classYear) {
		ClassYear = classYear;
	}

	public String getMajor() {
		return Major;
	}

	public void setMajor(String major) {
		Major = major;
	}

	@Override
	public String toString() {
		return "Student [FirstName=" + FirstName + ", LastName=" + LastName + ", ClassYear=" + ClassYear + ", Major="
				+ Major + "]";
	}

}
