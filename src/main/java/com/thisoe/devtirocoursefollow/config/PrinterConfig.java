package com.thisoe.devtirocoursefollow.config;

import com.thisoe.devtirocoursefollow.services.BluePrinter;
import com.thisoe.devtirocoursefollow.services.ColorPrinter;
import com.thisoe.devtirocoursefollow.services.GreenPrinter;
import com.thisoe.devtirocoursefollow.services.RedPrinter;
import com.thisoe.devtirocoursefollow.services.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public BluePrinter bluePrinter(){
        return new JapaneseBluePrinter();
    }
    @Bean
    public RedPrinter redPrinter(){
        return new JapaneseRedPrinter();
    }
    @Bean
    public GreenPrinter greenPrinter(){
        return new JapaneseGreenPrinter();
    }

    @Bean
    public ColorPrinter colorPrinter(BluePrinter bluePrinter, RedPrinter redPrinter, GreenPrinter greenPrinter){
        return new ColorPrinterImpl(redPrinter,bluePrinter,greenPrinter);
    }
}
