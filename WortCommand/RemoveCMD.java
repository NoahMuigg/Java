public class RemoveCMD implements ICommand{
    private Wort w;
    private String addBuchstabe;

    public RemoveCMD(Wort w){
        this.w = w;
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
