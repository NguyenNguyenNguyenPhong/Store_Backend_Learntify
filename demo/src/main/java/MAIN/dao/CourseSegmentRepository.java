package MAIN.dao;

import MAIN.entity.CourseSegment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSegmentRepository extends JpaRepository<CourseSegment, Integer> {
}
