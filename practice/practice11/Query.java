public class Query{
    private String query;
    public Query(String q){
        this.query=q;
    } 

    @Override
    public String toString(){
        return "Sqript is"+query;
    }
}