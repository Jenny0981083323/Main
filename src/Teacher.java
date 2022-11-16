public class Teacher {
    private String name;
    private  int id;
    private  int age;
    private String subjectName;
    public Teacher(String name,int id,int age,String subjectName){
        this.age=age;
        this.id=id;
        this.name=name;
        this.subjectName=subjectName;

    }
    public void sit(){
        System.out.println("Sitting..");

    }
    public void eat()   {
    System.out.println("eat..");
    }
    public void teach(){
        System.out.println("Teach..");
    }


}
