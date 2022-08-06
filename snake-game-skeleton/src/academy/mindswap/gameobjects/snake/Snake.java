package academy.mindswap.gameobjects.snake;

import academy.mindswap.field.Position;

import java.util.Iterator;
import java.util.LinkedList;

import static academy.mindswap.gameobjects.snake.Direction.*;

public class Snake implements Iterable {

    private final static int SNAKE_INITIAL_SIZE = 3;
    private Direction direction;
    private boolean alive;

    public Position setHead(Position head) {
        return new Position(head.getX(), head.getY());
    }

    private Position head;

    private Position tail;

    private LinkedList<Position> snakePosition;

    public Snake() {
        this.alive = true;
        createSnake();

    }

    public void createSnake () {
        snakePosition = new LinkedList<>();
        getSnakePosition().add(new Position(10,10));
        getSnakePosition().add(new Position(9,10));
        head = getSnakePosition().getFirst();
        tail = getSnakePosition().getLast();
        direction = DOWN;
    }

    public void increaseSize() {

    }

    public void move(Direction direction) {
        this.direction=direction;
    }

    public void move(){
        switch (direction) {
            case LEFT:
                snakePosition.addFirst(new Position(head.getX()-1, head.getY()));
                getSnakePosition().removeLast();
                head=getSnakePosition().getFirst();
                tail=getSnakePosition().getLast();
                break;
            case DOWN:
                snakePosition.addFirst(new Position(head.getX(), head.getY() + 1));
                getSnakePosition().removeLast();
                head=getSnakePosition().getFirst();
                tail=getSnakePosition().getLast();
                break;
            case RIGHT:
                snakePosition.addFirst(new Position(head.getX()+1, head.getY() ));
                getSnakePosition().removeLast();
                head=getSnakePosition().getFirst();
                tail=getSnakePosition().getLast();
                break;
            case UP:
                snakePosition.addFirst(new Position(head.getX(), head.getY() -1));
                getSnakePosition().removeLast();
                head=getSnakePosition().getFirst();
                tail=getSnakePosition().getLast();
                break;
        }
    }

    public void die() {
        alive = false;
    }

    public boolean isAlive() {
        return alive;
    }

    public Position getHead() {
        return head;
    }

    public Position getTail() {
        return tail;
    }

    public LinkedList<Position> getSnakePosition(){
        return snakePosition;
    }

    public int getSnakeSize() {
        return snakePosition.size();
    }

    @Override
    public Iterator iterator() {
        return new Iterator() {

            int currentPosition = 0;
            @Override
            public boolean hasNext() {
                return currentPosition < snakePosition.size();
            }

            @Override
            public Object next() {
                return currentPosition++;
            }
        };
    }
}

