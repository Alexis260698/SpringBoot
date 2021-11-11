package com.example.SpringBoot.SpringBootNTT.Service;

import com.example.SpringBoot.SpringBootNTT.Entity.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private ArrayList<Student> studentList= new ArrayList<>(List.of(new Student(1, "Jose"),
            new Student(2, "Maria")));

    public void addStudent(Student student){

        studentList.add(student);
    }

    public ArrayList<Student> getLista(){
        return studentList;
    }

    public Student getStudent(String name){
        for(Student s: studentList){
            if(s.getName().equals(name)){
                return s;
            }
        }

        return null;
    }


}
