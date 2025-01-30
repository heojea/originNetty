package stateMachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StateMachineApplication {
/*public class StateMachineApplication implements CommandLineRunner {*/


    public static void main(String[] args) {
        SpringApplication.run(StateMachineApplication.class, args);
    }

    /*@Override
    public void run(String... args) throws Exception {
        buttonService.processEvent(ButtonEvent.ONCLICK);   // Fetching data...
        buttonService.processEvent(ButtonEvent.FAILURE);   // Error occurred.
        buttonService.processEvent(ButtonEvent.RETRY);     // Retrying...
        buttonService.processEvent(ButtonEvent.SUCCESS);   // Data fetched successfully.
    }*/
}
