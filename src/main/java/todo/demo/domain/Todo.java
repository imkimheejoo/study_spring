package todo.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;
    @Column(nullable = false)
    private LocalDate writeDate;
    @Column(nullable = false)
    private String contents;

    public Todo(String contents) {
        this.writeDate = LocalDate.now();
        this.contents = contents;
    }
}
