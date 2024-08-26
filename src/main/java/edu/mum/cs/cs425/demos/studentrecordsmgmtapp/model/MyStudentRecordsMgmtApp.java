package edu.mum.cs.cs425.demos.studentrecordsmgmtapp.model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MyStudentRecordsMgmtApp {
    public static void main(String[] args) {
        // Create an array of students
        Student[] students = {
                new Student("S001", "Alice", "1994-05-12"),
                new Student("S002", "Bob", "1989-07-25"),
                new Student("S003", "Charlie", "2000-08-15")
        };

        // Call the getListOfPlatinumAlumniStudents method
        List<Student> platinumAlumniStudents = getListOfPlatinumAlumniStudents(students);

        // Print the PlatinumAlumni students
        System.out.println("Platinum Alumni Students:");
        for (Student student : platinumAlumniStudents) {
            System.out.println(student);
        }
    }

    // Method to print the list of students in ascending order of their names
    public static void printListOfStudents(Student[] students) {
        Arrays.sort(students, Comparator.comparing(Student::getName));
        for (Student student : students) {
            student.toString();
        }
    }

    // Method to get the list of PlatinumAlumni students
    public static List<Student> getListOfPlatinumAlumniStudents(Student[] students) {
        List<Student> platinumAlumniList = new ArrayList<>();
        for (Student student : students) {
            if (Student.isPlatinumAlumni(student)) {
                platinumAlumniList.add(student);
            }
        }
        // Sort by date of admission in descending order
        platinumAlumniList.sort((s1, s2) -> {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate date1 = LocalDate.parse(s1.getDateOfAdmission(), formatter);
            LocalDate date2 = LocalDate.parse(s2.getDateOfAdmission(), formatter);
            return date2.compareTo(date1); // Descending order
        });
        return platinumAlumniList;
    }

}
