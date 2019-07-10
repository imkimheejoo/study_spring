package todo.demo.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import todo.demo.domain.Todo;

import javax.transaction.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@Transactional
public class TodoRepositoryTest {
    @Autowired
    TodoRepository todoRepository;

    @Test
    public void name() {
        Todo todo = new Todo(1L,"Buddy","aaa","ddd");

        Todo t  = todoRepository.save(todo);
        assertEquals(todo, t);
    }
}