public class Student {
    private String name;
    private  int id;
    private  int age;
    private String className;
    public Student(String name,int id,int age,String className){
        this.name=name;
        this.age=age;
        this.id=id;
        this.className=className;
    }
    public void sit(){
        System.out.println("String....");

    }
    public  void  eat(){
        System.out.println("Eating...");

    }
    public void learn(){
        System.out.println("Learning....");
    }


}
