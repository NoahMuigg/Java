public class AddCMD implements ICommand{
    private Wort w;
    private String addBuchstabe;

    public AddCMD(Wort w, String addBuchstabe){
        this.w = w;
        this.addBuchstabe = addBuchstabe;
    }

    @Override
    public void ausführen(){
        w.add(addBuchstabe);
    }

    @Override
    public void rückgängig(){
        w.remove();
    }
}
