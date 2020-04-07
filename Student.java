public class Student{

    private String name;
    private String id;
    private double score;
    
    //Default constructor
    public Student(){     
        name = null;
        id = null;
        score = 0.0;
    }
    
    //Normal Constructor
    public Student(String n, String i, double s){
        name = n;
        id = i;
        score = s;
    }
    
    //Mutators
    public void setName(String name){
        this.name = name;
    }    
    public void setId(String id){
        this.id = id;
    }    
    public void setScore(double score){
        this.score = score;
    }
    
    //Accessors
    public String getName() {return name;}
    public String getId() {return id;}
    public double getScore() {return score;}
    
    //Printer
    @Override
    public String toString(){
        return ("Name : "+name+"\nId : "+id+"\nScore : "+score);
    }
}
