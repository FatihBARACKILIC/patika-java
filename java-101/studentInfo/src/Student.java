public class Student {
    Course course1;
    Course course2;
    Course course3;
    String name;
    String studentNo;
    String classes;
    double average;
    boolean isPass;

    public Student(String name, String studentNo, String classes, Course course1, Course course2, Course course3) {
        this.name = name;
        this.studentNo = studentNo;
        this.classes = classes;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.average = 0.0;
        this.isPass = false;
    }

    void addBulkExamNote(int course1Note, int course2Note, int course3Note) {
        if (0 <= course1Note && course1Note <= 100) {
            this.course1.note = course1Note;
        }
        if (0 <= course2Note && course2Note <= 100) {
            this.course2.note = course2Note;
        }
        if (0 <= course3Note && course3Note <= 100) {
            this.course3.note = course3Note;
        }
    }

    void isPass() {
        this.average = (this.course1.note + this.course2.note + this.course3.note) / 3.0;
        if (this.average > 55) {
            System.out.println("You passed the class!");
            this.isPass = true;
        } else {
            System.out.println("You couldn't pass the class!");
            this.isPass = false;
        }
        printNote();
    }

    void printNote() {
        System.out.println(this.course1.name + " note: " + this.course1.note);
        System.out.println(this.course2.name + " note: " + this.course2.note);
        System.out.println(this.course3.name + " note: " + this.course3.note);
        System.out.printf("Your average: %.2f\n" , this.average);
    }
}
