package todo.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import todo.demo.domain.Todo;
import todo.demo.repository.TodoRepository;

import java.util.Arrays;
import java.util.List;

@Controller
public class TodoController {
    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/")
    public String index (Model model) {

        Todo todo = new Todo(1L,"Buddy","aaa","ddd");
        todoRepository.save(todo);
        List<Todo> todos = todoRepository.findAll();
        model.addAttribute("todos",todos);
        return "index";
    }




}
