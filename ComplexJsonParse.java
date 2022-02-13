//import io.restassured.RestAssured;
//import io.restassured.path.json.JsonPath;
//import io.restassured.specification.RequestSpecification;
import io.restassured.path.json.JsonPath;

//import static io.restassured.RestAssured.*;
//import static org.hamcrest.Matchers.*;

import Files.PayLoad;




public class ComplexJsonParse {
	
	public static void main(String[]args) {
		
		JsonPath js = new JsonPath(PayLoad.CoursePricee());
		
		int count=js.getInt("courses.size()");
		System.out.println(count);
		int totalamt=js.getInt("dashboard.purschaseamount");
		System.out.println(totalamt);
		
		String titlef=js.getString("courses[0].title");
		System.out.println(titlef);
		
		for(int i=0;i<count;i++) {
			String title=js.getString("courses["+i+"].title");
			int price=js.getInt("courses["+i+"].price");
			System.out.println(title);	
			System.out.println(price);
			
		}
		System.out.println("Number of copies sold by RPA course:");
		for(int i=0;i<count;i++) {
			String ctitle=js.getString("courses["+i+"].title");
			if(ctitle.equalsIgnoreCase("RPA")) {
				int copies=js.get("courses["+i+"].copies");
				System.out.println(copies);
			}
			
		}
		
		
		
		
		
	}
	

}
