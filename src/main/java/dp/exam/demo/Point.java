package dp.exam.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data @AllArgsConstructor @NoArgsConstructor
@Component
public class Point {
    private int X;
    private int Y;

}
