package academy.mindswap.field;

public class Position{

    private int x;
    private int y;


    public Position(int x, int y) {
//        this.col = (int) Math.ceil(Math.random() * 99);
//        this.row = (int) Math.ceil(Math.random() * 24);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
