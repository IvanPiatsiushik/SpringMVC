#Spring MVC

Create a maven project in intelleji idea.
First, we write the dependencies we need in the file 
pom.xml :
- spring-boot-starter-web
- spring-boot-starter-test
- spring-boot-starter-thymeleaf

  
  We create a controller class and in this class
  we write our mapping,which will process our url
  requests.At the address "/home" our controller
  will return view "home".

```java
 @GetMapping("/home")
    public String home(){
        return "home";
    }
```
In the templates folder, create views and call the
main method marked @SpringBootApplication
```java
@SpringBootApplication
public class DemoversionApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoversionApplication.class, args);
	}
}
```



