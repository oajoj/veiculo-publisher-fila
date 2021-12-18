package br.edu.ifpa.veiculospublisher.publisher;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

@Component
public class VeiculoPublisher {

    private RabbitTemplate rabbitTemplate;

    private Queue queue;

    public VeiculoPublisher(RabbitTemplate rabbitTemplate, Queue queue){
        this.rabbitTemplate = rabbitTemplate;
        this.queue = queue;
    }

    public void send(String msg){
        rabbitTemplate.convertAndSend(this.queue.getName(), msg);
    }
}
