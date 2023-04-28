public class main {
    public static void main(String[] args){
        CommandRecorder cr = new CommandRecorder();

        Wort w1 = new Wort();

        AddCMD add = new AddCMD(w1, "d");
        RemoveCMD remove = new RemoveCMD(w1);

        cr.ausführen(add);
        cr.undo();

    }
}
