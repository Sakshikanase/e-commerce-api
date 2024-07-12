package org.dnyanyog.dto;

import java.sql.SQLException;

import org.dnyanyog.common.DBUtils;

public class AddUserRequest {

	public String name;
	public String lastname;
	public String email;
	public String age;
	public String gender;
	public String password;

	public AddUserRequest(int user_id, String name, String email, String address, String username, String password, String lastname, String age, String gender) {

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