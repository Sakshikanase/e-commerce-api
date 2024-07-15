package org.dnyanyog.dto;

import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;

public class AddUserRequest {

	public String name;
	public String lastname;
	public String email;
	public int age;
	public String gender;
	public String password;

	public AddUserRequest(String name, String email, String password, String lastname, int age, String gender) {

		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.password = password;
	}

	public boolean addUserIntoDb() throws SQLException {
		String query = "INSERT INTO user (First_name, last_name, age, gender, Email, Password) VALUES ( '" + name
				+ "','" + lastname + "'," + age + ",'" + gender + "', ' " + email + "','" + password + "')";

		int rowsInserted = DBUtils.executeUpdateQuery(query);
		return rowsInserted > 0;

	}

}