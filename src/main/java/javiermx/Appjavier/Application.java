package javiermx.Appjavier;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableJpaRepositories(basePackages = "javiermx.repositories")
public class Application {
    public static void main(String[] args) {
      SpringApplication.run(Application.class, args);
    }
    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
      return String.format("Hello %s!", name);
    }
    
    
	private static Connection getConnection() throws SQLException {
	    // Implement the code to establish a MySQL database connection here
	    String DB_URL = "jdbc:mysql://localhost/311";
	    String USER = "root";
	    String PASS = "Chuchomysql_01";
	    return DriverManager.getConnection(DB_URL, USER, PASS);
	}
    
}