package me.gabriel.neo4j.infra.db.adapters;

import lombok.AllArgsConstructor;
import me.gabriel.neo4j.core.domain.Student;
import me.gabriel.neo4j.core.ports.StudentRepository;
import me.gabriel.neo4j.infra.db.repositories.StudentNeo4jRepository;
import org.springframework.stereotype.Component;

/**
 * @author daohn
 * @since 19/08/2021
 */
@Component
@AllArgsConstructor
public class StudentRepositoryAdapter implements StudentRepository {

  private final StudentNeo4jRepository repository;

  @Override public Student create(Student student) {
    return this.repository.save(student);
  }
}
