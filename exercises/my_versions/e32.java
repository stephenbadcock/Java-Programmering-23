public class e32 {
    public static void main(String[] args) {
        Student s = new Student("Stephen", 37, 4.9);

        System.out.println(s.name + ", " + s.age + ", " + s.grade);
    }
}

class Student {
    public String name;
    public int age;
    public double grade;

    Student (String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
