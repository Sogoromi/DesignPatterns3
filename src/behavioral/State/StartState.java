package behavioral.State;

public class StartState implements State {
    @Override
    public String toString() {
        return "StartState{}";
    }

    @Override
    public void doAction(StateContext context) {
        System.out.println("Player is in start state...");
        context.setState(this);
    }
}