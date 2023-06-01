package geekbrains.lesson4.generic;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Box implements Comparable<Box>{
    private int size;

    @Override
    public int compareTo(Box o) {
        return this.size - o.size;
    }

//    @Override
//    public int compareTo(Object o) {
//        if (this == o) {
//            return 0;
//        }
//        if (o instanceof Box) {
//
//        }
//        Box another = (Box) o;
//        return this.size - another.size;
//    }
}
