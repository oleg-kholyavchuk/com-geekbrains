package geekbrains.lesson1;

public class Box {
    String color;
    int size;

    public Box(String color, int size) {
        this.color = color;
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Box)) return false;
        Box another = (Box) o;
        return this.color.equals(another.color) && this.size == another.size;
    }

    @Override
    public int hashCode() {
        return color.length() * 13 + size * 71;
    }
}
