package todo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import todo.demo.domain.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo,Long> {
}
