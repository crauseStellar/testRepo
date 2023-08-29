public class Student extends Person{
    private String course;

    public Student(String course) {
        this.course = course;
    }

    public Student(String name, String course) {
        super(name);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
//    @Override
//    public void sayHello(){
//        System.out.println(getName()+" from "+getCourse()+" says hi!");
//    }
}


//   12121212121121221