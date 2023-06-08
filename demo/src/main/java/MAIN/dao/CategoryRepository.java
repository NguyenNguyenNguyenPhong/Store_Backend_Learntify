package MAIN.dao;

import MAIN.entity.Category;
import MAIN.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository  extends JpaRepository<Category, Integer> {
}
