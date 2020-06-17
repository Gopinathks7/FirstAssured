package com.test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutTest 
{
	@Test
	public void getPutTest()
	{
		
		try
		{
	
		RequestSpecification httprequest=RestAssured.given();
		httprequest.header("Content-Type","application/json");
		JSONObject  requestparamenter=new JSONObject();
		requestparamenter.put("id",98 );
		requestparamenter.put("title","Shimoga" );
		requestparamenter.put("author","Nanda" );
		httprequest.body(requestparamenter.toJSONString());
		Response response=httprequest.put("http://localhost:3000/posts/98");
		int actual=response.getStatusCode();
		System.out.println("The Actual Code is "+actual);
		Assert.assertEquals(actual, 200);
}
catch(Exception e)
		{
	e.printStackTrace();
		}
}
	
}

