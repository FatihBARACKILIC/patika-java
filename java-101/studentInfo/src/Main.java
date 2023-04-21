public class Main {
    public static void main(String[] args) {
        Teacher mathTeacher = new Teacher("Ali Veli", "123456789", "Math");
        Teacher historyTeacher = new Teacher("Mahmut Hoca", "123456", "Hist");
        Teacher physicsTeacher = new Teacher("Cuma Cumali", "12354", "physics");

        Course mathematics = new Course("Mathematics", "101", "Math");
        mathematics.addTeacher(mathTeacher);
        Course history = new Course("History", "101", "Hist");
        history.addTeacher(historyTeacher);
        Course physics = new Course("Physics", "101", "physics");
        physics.addTeacher(physicsTeacher);

        Student student1 = new Student("İnek Şaban", "123", "4", history, mathematics, physics);
        student1.addBulkExamNote(45, 12, 79);
        student1.isPass();

        Student student2 = new Student("Güdük Necmi", "234", "4", history, mathematics, physics);
        student2.addBulkExamNote(45,16, 99);
        student2.isPass();
    }
}