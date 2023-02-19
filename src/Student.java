public class Student {
    private  String name;
    private  int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

   public  Student(String fullName){
        String[] splitString= fullName.split("-");
        name=splitString[0];
        age=Integer.parseInt(splitString[1]);
   }

    @Override
    public String toString() {
        return name + ", " + age;
    }
}
