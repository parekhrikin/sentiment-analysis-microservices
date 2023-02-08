package edu.sa.web;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication(exclude = {ErrorMvcAutoConfiguration.class})
class SentimentAnalysisWebApp {
    public static void main(String[] args) { 
        SpringApplication.run(SentimentAnalysisWebApp.class, args);
    }
}
