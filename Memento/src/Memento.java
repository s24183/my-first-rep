public class Memento {
    private String TodoAppstate;

    public Memento(String state) {
        this.TodoAppstate = state;
    }

    public String getState() {
        return TodoAppstate;
    }

    public void setState(String state) {
        this.TodoAppstate = state;
    }
}
