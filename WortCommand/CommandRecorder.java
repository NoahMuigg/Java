import java.util.Stack;

public class CommandRecorder {

    public Stack<ICommand> undoStack = new Stack<ICommand>();
    public Stack<ICommand> redoStack = new Stack<ICommand>();

    public void undo(){
        ICommand ic = undoStack.pop();
        redoStack.push(ic);
        ic.rückgängig();
    }

    public void redo(){
        ICommand ic = redoStack.pop();
        undoStack.push(ic);
        ic.ausführen();
    }

    public void ausführen(ICommand ic){
        ic.ausführen();
        undoStack.push(ic);
    }
}
