public class RemoveCMD implements ICommand{
    private Wort w;
    private String addBuchstabe;

    public RemoveCMD(Wort w, String addBuchstabe){
        this.w = w;
        this.addBuchstabe = addBuchstabe;
    }
    
    @Override
    public void ausführen(){
        w.remove();
    }

    @Override
    public void rückgängig(){
        w.add(addBuchstabe);
    }
}
