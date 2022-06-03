import java.util.ArrayList;
public class TodoList {
    private ArrayList<String> todo;

    public TodoList() {
        this.todo = new ArrayList<>();
    }

    public void add(String task) {
        this.todo.add(task);
    }

    public void remove(int number) {
        this.todo.remove(number-1);
    }

    public void print() {
        if (!todo.isEmpty()) {
            for (int i = 0; i < todo.size(); i++) {
                int numStarting1 = i+1;
                System.out.println(numStarting1 + ": " + todo.get(i));
            }
        }
    }
}
