package july_24;

public class Student {
    String name="Ketan";
    private int age=19;

    public void setAge(int age){
        if(age<0) {
            System.out.println("Age negative nhi hoti !");
            return;
        }
        this.age=age;
    }
    public void introduce(){
        System.out.println("Name: "+name+ " Age:"+age);
    }

    public Student(){}
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

