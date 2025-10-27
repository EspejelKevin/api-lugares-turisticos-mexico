package api.tourist_places_mexico;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "api.tourist_places_mexico")
@SpringBootApplication
public class TouristPlacesMexicoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TouristPlacesMexicoApplication.class, args);
	}

}
