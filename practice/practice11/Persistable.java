public interface Persistable{
    public void create(Query name);
    public Object retrieve(Query name);
    public void update(Query name);
    public void delete(Query name);
    public void connect();
}