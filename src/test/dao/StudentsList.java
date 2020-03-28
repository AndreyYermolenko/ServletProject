package test.dao;

import test.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentsList {
    private static List<Student> list = new ArrayList<>();

    public static List<Student> getList() {
        return list;
    }

    public static void addStudent(Student student) {
        list.add(student);
    }
}
