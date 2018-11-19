package com.spring.myapp;

import static org.junit.Assert.*;
import org.junit.Test;
import java.sql.*;

public class mysqlTest {
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/spring_main";
	private static final String USER = "root"; // DB 사용자명
	private static final String PW = "1234"; // DB 사용자 비밀번호

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER);

		try (Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println("성공");
			System.out.println(con);
		} catch (Exception e) {
			System.out.println("에러발생");
			e.printStackTrace();
		}
	}
}
