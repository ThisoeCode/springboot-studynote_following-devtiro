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

	public static void main(String[] args) {
		SpringApplication.run(ColorApplication.class, args);
	}

	@Override
	public void run(final String... args) {
		final ColorPrinter colourPrinter = new ColorPrinterImpl();
		log.info(colourPrinter.print());
	}
}
