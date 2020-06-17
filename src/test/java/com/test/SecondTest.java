package com.test;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SecondTest 
{
	
	@Test
	public void getDetailsOfWeather()
	{
		
		try
		{
	
		RequestSpecification httprequest=RestAssured.given();
		httprequest.header("Content-Type","application/json");
		JSONObject  requestparamenter=new JSONObject();
		requestparamenter.put("id",98 );
		requestparamenter.put("title","Bangalore" );
		requestparamenter.put("author","Nanda" );
		httprequest.body(requestparamenter.toJSONString());
		Response response=httprequest.post("http://localhost:3000/posts");
		int actual=response.getStatusCode();
		System.out.println(actual);
		Assert.assertEquals(actual, 201);
}
catch(Exception e)
		{
	e.printStackTrace();
		}
}
	
}