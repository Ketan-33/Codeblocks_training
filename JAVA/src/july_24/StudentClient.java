package july_24;

public class StudentClient {
    public static void main(String[] args) {
        Student mystudent =new Student();
        Student mystudent1 =new Student("Spidy",20);
//        System.out.println(mystudent.name);

        mystudent.introduce();
        mystudent.setAge(-1);
        mystudent1.introduce();

    }
}
