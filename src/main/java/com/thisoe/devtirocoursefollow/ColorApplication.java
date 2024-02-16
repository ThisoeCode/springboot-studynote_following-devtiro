package com.thisoe.devtirocoursefollow;

import com.thisoe.devtirocoursefollow.services.ColorPrinter;
import com.thisoe.devtirocoursefollow.services.impl.ColorPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import lombok.extern.java.Log;

@SpringBootApplication
@Log
public class ColorApplication implements CommandLineRunner {

	private ColorPrinter cp;
	public ColorApplication(ColorPrinter colorPrinter) {
		this.cp = colorPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(ColorApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		log.info(cp.print());
	}
}