package todo.demo.code;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Restaurant {
    private Chef chef;

    public Restaurant() {
    }

    public Restaurant(Chef chef) {
        this.chef = chef;
    }
}
