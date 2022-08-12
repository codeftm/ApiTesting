package base_urls;//import org.junit.Before; //junit frameworktur junit has many annotation
//import io.restassured.builder.RequestSpecBuilder;
//import io.restassured.specification.RequestSpecification;
//
//
//    public class BaseUrls {
//
//        protected RequestSpecification spec;//we will request specification object. get clases wil be child. baseurl is parent
//
//        @Before//if you type @before annotatiion at the top of a method, will be excuted every test method
//        public void setUp(){
//
//            spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
//
//
//        }
//
//    }



import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class JsonPlaceHolderBaseUrls {

    protected RequestSpecification spec;
    //If you use @Before annotation at the top of a method, it will be executed before every test method.
    @Before
    public void setUp(){

        spec = new RequestSpecBuilder().setBaseUri("https://jsonplaceholder.typicode.com").build();

    }
}
