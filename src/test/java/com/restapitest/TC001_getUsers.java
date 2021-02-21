package com.restapitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC001_getUsers {
	
	@Test
	public void get_Users_List() {
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification httpRequest=RestAssured.given();
		
		Response response=httpRequest.request(Method.GET, "/api/users?page=2");
		
		String responseBody=response.getBody().asString();
		System.out.println("Response body is ::"+responseBody);
		
		//status code verification
		
		int statusCode=response.getStatusCode();
		
		System.out.println("status code is "+statusCode);
		
		Assert.assertEquals(statusCode, response.getStatusCode());
		
		Assert.assertEquals(statusCode, 201);
		System.out.println("added new line2 by testuser1");
		System.out.println("added new line3 by testuser2");
		System.out.println("added new line4 by testuser1");
		System.out.println("added new line5 by testuser1");
		System.out.println("added new line6 by testuser1");
		System.out.println("added new line7 by testuser1");
		System.out.println("added new line4 in develop branch by testuser2");
		System.out.println("added new line5 in develop branch by testuser2");
		System.out.println("added new line6 in develop branch by testuser2");
	}

}
