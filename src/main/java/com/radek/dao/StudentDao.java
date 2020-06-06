package com.radek.dao;
import com.radek.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
             put(1,new Student(1,"Said","computer science"));
             put(2,new Student(2,"Alex","Finance"));
             put(3,new Student(3,"Anna","Math"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id){
        return this.students.get(id);
    }

    public void removeById(int id) {
        this.students.remove(id);
    }
}
