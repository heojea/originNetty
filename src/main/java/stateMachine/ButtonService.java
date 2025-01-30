/*
package stateMachine;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.statemachine.StateMachine;
import org.springframework.statemachine.config.StateMachineFactory;
import org.springframework.stereotype.Service;

@Service
public class ButtonService {

    @Autowired
    private StateMachineFactory<ButtonState, ButtonEvent> factory;

    public void processEvent(ButtonEvent event) {
        StateMachine<ButtonState, ButtonEvent> stateMachine = factory.getStateMachine();
        stateMachine.start();
        System.out.println("Current state: " + stateMachine.getState().getId());

        stateMachine.sendEvent(event);
        System.out.println("Current state: " + stateMachine.getState().getId());
    }
}
*/
