package com.test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Delete 
{
	@Test
	
public void deleteDate()
{
	try
	{

	RequestSpecification httprequest=RestAssured.given();
	
	
	Response response=httprequest.delete("http://localhost:3000/posts/57");
	int actual=response.getStatusCode();
	System.out.println(actual);
	Assert.assertEquals(actual, 200);
	
}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}
