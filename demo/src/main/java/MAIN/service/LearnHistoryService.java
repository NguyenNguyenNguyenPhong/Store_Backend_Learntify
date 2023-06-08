package MAIN.service;

import MAIN.entity.LearnHistory;

import java.util.List;

public interface LearnHistoryService {

    List<LearnHistory> findAll();

    LearnHistory findById(int id);

    LearnHistory save(LearnHistory learnHistory);

    void deleteById(int id);
}
