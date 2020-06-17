package com.test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RequestTest 
{
@Test
public void getDetailsOfWeather()
{
	int actual = get("http://localhost:3000/").getStatusCode();
String data = get("http://localhost:3000/").asString();
System.out.println("The Data is : "+data);
System.out.println("The status code is  "+actual);
Assert.assertEquals(actual, 200);
long time = get("http://localhost:3000/").getTime();
System.out.println("The time take is" +time);
String statusid=get("http://localhost:3000/").getSessionId();
System.out.println("The Secession ID is "+statusid);
}
}