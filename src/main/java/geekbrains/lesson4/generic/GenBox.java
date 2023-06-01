package geekbrains.lesson4.generic;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class GenBox<T> {
    private T obj;

    public void doSomething(T[] array) {
    }
}
