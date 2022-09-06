package by.itstep.myproject.model;

import java.util.Objects;

public class User {
	private String name;
	private String lastName;
	private String login;
	private String password;


	public User() {
		super();
	}

	public User(String name, String lastName, String login, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.login = login;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(lastName, login, name, password);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(lastName, other.lastName) && Objects.equals(login, other.login)
				&& Objects.equals(name, other.name) && Objects.equals(password, other.password);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("User [name=");
		builder.append(name);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", login=");
		builder.append(login);
		builder.append(", password=");
		builder.append(password);
		builder.append("]");
		return builder.toString();
	}
	

}
