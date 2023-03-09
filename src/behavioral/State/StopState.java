package behavioral.State;

public class StopState implements State{
    @Override
    public void doAction(StateContext context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
    @Override
    public String toString() {
        return "StopState{}";
    }
}
