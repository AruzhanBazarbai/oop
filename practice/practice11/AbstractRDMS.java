public abstract class AbstractRDMS implements Persistable{
    protected String connection;
    public AbstractRDMS(String connect){
        connection=connect;
    }
    public String getConnection(){
        return connection;
    }
    public abstract void create(Query name);
    public abstract Object retrieve(Query name);
    public abstract void update(Query name);
    public abstract void delete(Query name);
    public abstract void connect();

    public abstract void beginTransaction();
    public abstract void endTransaction();
    public abstract Object executeProcedure();
    public abstract Object createAndReturnId();

}