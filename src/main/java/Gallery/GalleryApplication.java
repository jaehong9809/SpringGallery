package Gallery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
	인터페이스 -> 구현체

	appconfig -> 관계 설정
	controller -> model <- view
	 ----------------------------------------------------
	service
	----------------------------------------------------------------------------------
	repository jpa, jdbc -> mysql
*/
@SpringBootApplication
public class GalleryApplication {

	public static void main(String[] args) {
		SpringApplication.run(GalleryApplication.class, args);
	}

}
