package stateMachine;


import org.springframework.context.annotation.Configuration;
import org.springframework.statemachine.config.EnableStateMachine;
import org.springframework.statemachine.config.StateMachineConfigurerAdapter;
import org.springframework.statemachine.config.builders.StateMachineStateConfigurer;
import org.springframework.statemachine.config.builders.StateMachineTransitionConfigurer;

enum ButtonState {
    IDLE, FETCHING, ERROR
}

enum ButtonEvent {
    ONCLICK, FAILURE, SUCCESS, RETRY
}

@Configuration
@EnableStateMachine
public class StateMachineConfig extends StateMachineConfigurerAdapter<ButtonState, ButtonEvent> {

    @Override
    public void configure(StateMachineStateConfigurer<ButtonState, ButtonEvent> states) throws Exception {
        states
                .withStates()
                .initial(ButtonState.IDLE)
                .state(ButtonState.FETCHING)
                .state(ButtonState.ERROR);
    }

    @Override
    public void configure(StateMachineTransitionConfigurer<ButtonState, ButtonEvent> transitions) throws Exception {
        transitions
                .withExternal().source(ButtonState.IDLE).target(ButtonState.FETCHING).event(ButtonEvent.ONCLICK)
                .and()
                .withExternal().source(ButtonState.FETCHING).target(ButtonState.ERROR).event(ButtonEvent.FAILURE)
                .and()
                .withExternal().source(ButtonState.FETCHING).target(ButtonState.IDLE).event(ButtonEvent.SUCCESS)
                .and()
                .withExternal().source(ButtonState.ERROR).target(ButtonState.FETCHING).event(ButtonEvent.RETRY);
    }
}