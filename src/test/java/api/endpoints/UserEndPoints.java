package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import api.payload.User2;
import api.payload.User;
public class UserEndPoints {
	public static Response createUser(User payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		
		
		.when()
		.post(Routes.post_url);
		
		return response;
	}
	public static Response createUser(User2 payload)
	{
		Response response = given()
		.accept(ContentType.JSON)
		.contentType(ContentType.JSON)
		.body(payload)
		
		
		.when()
		.post(Routes.post_url);
		
		return response;
	}
	public static Response getUser(String username)
	{
		Response response=given()
				.accept(ContentType.JSON)
				.pathParam("username", username)
				.when()
				.get(Routes.get_url);
		return response;
	}
	public static Response updateUser(String username,User payload)
	{
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParam("username", username)
				.body(payload)
				
				
				.when()
				.put(Routes.put_url);
				
				return response;
	}
	public static Response updateUser(String username,User2 payload)
	{
		Response response = given()
				.accept(ContentType.JSON)
				.contentType(ContentType.JSON)
				.pathParam("username", username)
				.body(payload)
				
				
				.when()
				.put(Routes.put_url);
				
				return response;
	}
	public static Response deleteUser(String username)
	{
		Response response=given()
				.pathParam("username", username)
				.accept(ContentType.JSON)
				.when()
				.delete(Routes.del_url);
		return response;
	}
	
	
	
	
	
}
