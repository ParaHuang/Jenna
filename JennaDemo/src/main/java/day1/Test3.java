package day1;

public class Test3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Jack");
        try {
            //if there are many possible wrong code
            //then the program will jump to catch from the first exception place
            s1.setAge(19);
            System.out.println("--set up age---");
            s1.setGender("what??");
            System.out.println("--set up gender---");
        } catch (AgeException e) {
            e.printStackTrace();
        } catch(GenderException g){
            g.printStackTrace();
        }

        System.out.println("the end of program");
    }
}

class Student{
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeException {//3~60
        if(age<3 || age>60){
            //program crash -> detonate bombs
            throw new AgeException(age+" is not in the correct range for a student");
        }
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(!gender.equals("male") && !gender.equals("female")){
            throw new GenderException(gender + " is not a valid gender");
        }
        this.gender = gender;
    }
}

class AgeException extends Exception{  //->Compile exception
    public AgeException(String msg){
        super(msg);
    }
}
class GenderException extends RuntimeException{
    public GenderException(String message){
        super(message);   //super()
    }
}
