public class PostgresSqlDb extends AbstractRDMS{

    public PostgresSqlDb(String connect){
        super(connect);
    }
    @Override //-помогает избежать ошибок
    public void create(Query name){
        System.out.println("psql:Created"+name);
    }
    @Override
    public Object retrieve(Query name){
        System.out.println("psql:Retrived"+name);
        return new Object();
    }
    @Override
    public void update(Query name){
        System.out.println("psql:Updated"+name);
    }
    @Override
    public void delete(Query name){
        System.out.println("psql:Deleted "+name);
    }
    @Override
    public void connect(){
        System.out.println("psql:Connection established");
    }
    @Override
    public void beginTransaction(){
        System.out.println("psql:Transaction started");
    }
    @Override
    public void endTransaction(){
        System.out.println("psql:Transaction end");
    }
    @Override
    public Object executeProcedure(Strine procedure){
        System.out.println("psql:Procedure executing "+procedure);
        return new Object();
    }
    @Override
    public Object createAndReturnId(){
        System.out.println("psql:Created and return id "+name);
        return new Object();
    }

}