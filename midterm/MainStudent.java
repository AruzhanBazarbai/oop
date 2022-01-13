import java.util.*;
class Student{
    private int id,numberOfQuiz,totalScore=0;
    private String name;

    public Student(){

    }
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getNumberOfQuiz(){
        return this.numberOfQuiz;
    }
    public void setNumberOfQuiz(int num){
        this.numberOfQuiz=num;
    }
    public void calcTotalScore(int x){
        this.totalScore+=x;
    }
    public int getAverageScore(){
        return this.totalScore/this.numberOfQuiz;
    }
    public String toString(){
        return "Student "+this.name+" with id "+this.id;

    }

}
class MainStudent{
    public static void main(String[] args){
        Student s=new Student();
        Scanner input=new Scanner(System.in);
        String name=input.next();
        s.setName(name);
        int id=input.nextInt();
        s.setId(id);
        int n=input.nextInt();
        s.setNumberOfQuiz(n);
        for(int i=0;i<n;i++){
            int score=input.nextInt();
            s.calcTotalScore(score);
        }
        System.out.println(s.toString());
        System.out.println("Number of quizzes: "+s.getNumberOfQuiz());
        System.out.println("Average score is "+s.getAverageScore());


    }
}