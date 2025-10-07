package Class9;

class Student{
    private int id;
    private String name;
    private String dept;

    public Student(){
        this(id);
    }
    public Student(int id,String name,String dept){
        this.id=id;
        this.name=name;
        this.dept=dept;
    }
    public Student(int id,String name){
        this.id=id;
        this.name=name;
    }
    public Student(int id){
        this.id=id;
    }
    
}
public class Students {
    
}