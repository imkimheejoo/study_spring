package todo.demo.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Todo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long todoId;
    //    private Date writeDate;
    @Column(nullable = false)
    private String writer;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String contents;

}
