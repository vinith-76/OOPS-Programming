class Student {
    String name;
    int age;
    String course;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Rahul";
        student1.age = 20;
        student1.course = "Computer Science";

        Student student2 = new Student();
        student2.name = "Ananya";
        student2.age = 19;
        student2.course = "Artificial Intelligence";

        student1.display();
        student2.display();
    }
}
