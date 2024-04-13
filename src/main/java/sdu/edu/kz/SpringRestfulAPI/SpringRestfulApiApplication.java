package sdu.edu.kz.SpringRestfulAPI;

import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@SecurityScheme(name = "sduedu-demo-api", scheme = "bearer", type = SecuritySchemeType.HTTP, in = SecuritySchemeIn.HEADER)
public class SpringRestfulApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRestfulApiApplication.class, args);
	}

}
