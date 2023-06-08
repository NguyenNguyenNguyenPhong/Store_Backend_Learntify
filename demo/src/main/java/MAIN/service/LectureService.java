package MAIN.service;

import MAIN.entity.Course;
import MAIN.entity.Lecture;

import java.util.List;

public interface LectureService {
    List<Lecture> findAll();

    Lecture findById(int id);

    Lecture save(Lecture lecture);

    void  deleteById(int id);

}
