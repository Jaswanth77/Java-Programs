
import java.util.ArrayList;
import java.util.List;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class Student extends Person {
    public int studentId;

    public Student(String name, int age, int studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}

class Professor extends Person {
    public int employeeId;

    public Professor(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

class Course {
    public String courseCode;
    public String courseName;
    public List<String> prerequisites;
    public List<Student> enrolledStudents;

    public Course(String courseCode, String courseName, List<String> prerequisites) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.prerequisites = prerequisites;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        if (hasCompletedPrerequisites(student)) {
            enrolledStudents.add(student);
            System.out.println("Enrolled student " + student.getName() + " in course " + courseName);
        } else {
            System.out.println("Student " + student.getName() + " does not meet prerequisites for course " + courseName);
        }
    }

    private boolean hasCompletedPrerequisites(Student student) {
        for (String prerequisite : prerequisites) {
            // For simplicity, assuming a student has completed a prerequisite if their name contains it
            if (!student.getName().contains(prerequisite)) {
                return false;
            }
        }
        return true;
    }

    public void displayEnrolledStudents() {
        System.out.println("Enrolled students in course " + courseName + ":");
        for (Student student : enrolledStudents) {
            System.out.println("Student Name: " + student.getName() + ", Student ID: " + student.getStudentId());
        }
    }
}

public class Day4_qn3 {
    public static void main(String[] args) {
        // Create students and a professor
        Student student1 = new Student("Alice Johnson", 20, 123);
        Student student2 = new Student("Bob Smith", 22, 456);
        Professor professor = new Professor("Dr. Brown", 40, 789);

        // Create a course with prerequisites
        List<String> prerequisites = new ArrayList<>();
        prerequisites.add("Alice");
        prerequisites.add("Bob");
        Course javaCourse = new Course("CS101", "Java Programming", prerequisites);

        // Enroll students in the course
        javaCourse.enrollStudent(student1);
        javaCourse.enrollStudent(student2);

        // Display enrolled students in the course
        javaCourse.displayEnrolledStudents();
    }
}
