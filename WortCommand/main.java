public class main {
    public static void main(String[] args){
        CommandRecorder cr = new CommandRecorder();

        Wort w1 = new Wort();

        AddCMD add = new AddCMD(w1, "d");
        cr.ausführen(add);
        cr.ausführen(add);

        cr.undo();
        cr.undo();
        cr.redo();
        cr.redo();

    }
}
