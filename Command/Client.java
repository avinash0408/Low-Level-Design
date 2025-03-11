package Command;

interface ICommand {
    void execute();
}
class Document{
    public void open(){
        System.out.println("File Opened");
    }
    public void save(){
        System.out.println("File Saved");
    }
}
class ActionOpen implements ICommand {
    private Document doc;
    public ActionOpen(Document doc){
        this.doc = doc;
    }
    @Override
    public void execute(){
        doc.open();
    }
}

class ActionSave implements ICommand {
    private Document doc;
    public ActionSave(Document doc){
        this.doc = doc;
    }
    @Override
    public void execute(){
        doc.save();
    }
}
public class Client {
    public static void main(String[] args) {
        Document d = new Document();
        ICommand actionOpen = new ActionOpen(d);
        ICommand actionSave = new ActionSave(d);

        actionOpen.execute();
        actionSave.execute();
    }
}
