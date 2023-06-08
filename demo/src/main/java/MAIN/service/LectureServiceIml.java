package MAIN.service;

import MAIN.dao.LectureRepository;
import MAIN.entity.Lecture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LectureServiceIml implements LectureService {

    private LectureRepository lectureRepository;

    @Autowired
    public LectureServiceIml(LectureRepository lectureRepository) {
        this.lectureRepository = lectureRepository;
    }

    @Override
    public List<Lecture> findAll() {
        return lectureRepository.findAll();
    }

    @Override
    public Lecture findById(int id) {
        Optional<Lecture> result = lectureRepository.findById(id);
        Lecture lecture = null;
        if (result.isPresent()) {
            lecture = result.get();
        } else {
            throw new RuntimeException("Did not find Lecture with id: " + id);
        }
        return lecture;
    }

    @Override
    public Lecture save(Lecture lecture) {
        return lectureRepository.save(lecture);
    }

    @Override
    public void deleteById(int id) {
        lectureRepository.deleteById(id);
    }
}
