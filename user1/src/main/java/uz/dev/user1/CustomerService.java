package uz.dev.user1;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CustomerService {

    @RabbitListener(queues = "user2")
    public void receiver(String messageReceieved){
        System.out.println("Message from Students: "+messageReceieved);
    }
}
