package behavioral.State;

public class StateContext {
    private  State state;

    public  StateContext(){
        state= null;
    }
    public  StateContext(State state){
        this.state = state;
    }
    public  void setState(State state){
        this.state = state;
    }
  public State getState(){
        return  state;
  }

}
