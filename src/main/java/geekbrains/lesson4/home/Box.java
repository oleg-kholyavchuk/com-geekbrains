package geekbrains.lesson4.home;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Box<T> extends ArrayList<T> {
    private double weight;

    public double getWeight(Fruit fruit, int count) {
        this.weight = fruit.getWeight() * count;
        return fruit.getWeight() * count;
    }

    public boolean compare(Box box) {
        if(this.weight == box.weight){
            return true;
        } else return false;
    }
//
//    public void transfer(Box<T> another) {
//        if(this == another) {
//            return;
//        }
//        another.container.addAll(this.container);
//        this.container.clear();
//    }
}
