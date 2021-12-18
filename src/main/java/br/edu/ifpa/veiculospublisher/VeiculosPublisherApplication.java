package br.edu.ifpa.veiculospublisher;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class VeiculosPublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(VeiculosPublisherApplication.class, args);
    }

}
