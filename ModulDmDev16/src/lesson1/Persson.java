package lesson1;

public abstract class Persson {

    LongOne id;

    public Persson(LongOne id) {
        this.id = id;
    }

    public LongOne getId() {
        return id;
    }
}
