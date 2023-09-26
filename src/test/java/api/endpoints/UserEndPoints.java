package api.endpoints;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

import api.payload.User;

public class UserEndPoints {
	
//Post : Create User
	
	public static Response createUser(User payload)
	{
		Response response = given()
						.contentType(ContentType.JSON)
						.accept(ContentType.JSON)
						.body(payload)
					.when()
						.post(Routes.post_url);
				
				return response;
	}
	
//Get : Get User details
	
	public static Response readUser(String userName)
	{
		Response response = given()
						.pathParam("username", userName)
					.when()
						.get(Routes.get_url);
				
				return response;
	}

//Update : Update User details
	
	public static Response updateUser(String userName, User payload)
	{
		Response response = given()
						.contentType(ContentType.JSON)
						.accept(ContentType.JSON)
						.body(payload)
						.pathParam("username", userName)
					.when()
						.get(Routes.update_url);
				
				return response;
		}
//Delete : Delete User details
	
	public static Response deleteUser(String userName)
	{
		Response response = given()
						.pathParam("username", userName)
					.when()
						.get(Routes.delete_url);
				
				return response;
		}	
}
