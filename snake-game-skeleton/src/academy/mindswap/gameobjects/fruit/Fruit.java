package academy.mindswap.gameobjects.fruit;

import academy.mindswap.field.Position;

import java.util.Random;

public class Fruit {
    Position position;




    public Fruit(int cols, int rows) {
        Random random = new Random();
        int x = random.nextInt(cols-1)+1;
        int y = random.nextInt(rows-1 )+1 ;
     this.position= new Position(x,y);
    }

    public Position getPosition() {
        return position;
    }
}
