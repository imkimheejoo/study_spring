package todo.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import todo.demo.domain.Todo;
import todo.demo.repository.TodoRepository;

import java.util.List;

@Controller
public class TodoController {
//    @Autowired
    TodoRepository todoRepository;

    @GetMapping("/")
    public String index (Model model) {
//        List<Todo> todos = todoRepository.findAll();
//        model.addAttribute("todos",todos);
        return "index";
    }

    @PostMapping("/create/todo")
    public String create_todo (Todo todo) {
        todoRepository.save(todo);

        return "redirect:/";
    }




}
