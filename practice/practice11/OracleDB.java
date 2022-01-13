public class OracleDB extends AbstractRDMS{

    public OracleDB(String connect){
        super(connect);
    }
    @Override //-помогает избежать ошибок
    public void create(Query name){
        System.out.println("Created"+name);
    }
    @Override
    public Object retrieve(Query name){
        System.out.println("Retrived"+name);
    }
    @Override
    public void update(Query name){
        System.out.println("Updated"+name);
    }
    @Override
    public void delete(Query name){
        System.out.println("Deleted "+name);
    }
    @Override
    public void connect(){
        System.out.println("Connection established");
    }
    @Override
    public void beginTransaction(){
        System.out.println("Transaction started");
    }
    @Override
    public void endTransaction(){
        System.out.println("Transaction end");
    }
    @Override
    public Object executeProcedure(Strine procedure){
        System.out.println("Procedure executing "+procedure);
        return new Object();
    }
    @Override
    public Object createAndReturnId(){
        System.out.println("Created and return id "+name);
        return new Object();
    }

}