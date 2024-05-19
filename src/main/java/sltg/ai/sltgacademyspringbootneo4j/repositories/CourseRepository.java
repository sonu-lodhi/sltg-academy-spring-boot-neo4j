package sltg.ai.sltgacademyspringbootneo4j.repositories;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import sltg.ai.sltgacademyspringbootneo4j.models.Course;

public interface CourseRepository extends Neo4jRepository<Course, Long> {
}
