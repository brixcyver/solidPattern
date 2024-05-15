public class Main {
    public static void main(String[] args) {
        Student student = new Student(new ResourceManager());

        student.borrowResource("book", "Introduction to Java");
        student.borrowResource("journal", "Science Journal");

        student.returnResource("book", "Introduction to Java");
        student.returnResource("journal", "Science Journal");
    }
}