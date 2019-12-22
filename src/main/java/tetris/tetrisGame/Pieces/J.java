package tetris.tetrisGame.Pieces;

import tetris.tetrisGame.GridElement;
import tetris.tetrisGame.PlayingField;
import tetris.tetrisGame.TetriminoOld;

import java.awt.Color;

/**
 * Class representing the tetris.J-piece
 * @author MatRusTy
 */
public class J extends TetriminoOld {

    public J(PlayingField p){
        super(Color.BLUE, p);
        pieces.add(new GridElement(21,3, Color.BLUE, true));
        pieces.add(new GridElement(20,3, Color.BLUE, true));
        pieces.add(new GridElement(20,4, Color.BLUE, true));
        pieces.add(new GridElement(20,5, Color.BLUE, true));
        zero = pieces.get(0);
        one = pieces.get(1);
        two = pieces.get(2);
        three = pieces.get(3);
    }

    @Override
    public void rotateClockwiseCase0() {
        zeroy = zero.y();
        zerox = zero.x()+2;

        oney = one.y()+1;
        onex = one.x()+1;

        twoy = two.y();
        twox = two.x();

        threey = three.y()-1;
        threex = three.x()-1;
    }

    @Override
    public void rotateClockwiseCase1() {
        zeroy = zero.y()-2;
        zerox = zero.x();

        oney = one.y()-1;
        onex = one.x()+1;

        twoy = two.y();
        twox = two.x();

        threey = three.y()+1;
        threex = three.x()-1;
    }

    @Override
    public void rotateClockwiseCase2() {
        zeroy = zero.y();
        zerox = zero.x()-2;

        oney = one.y()-1;
        onex = one.x()-1;

        twoy = two.y();
        twox = two.x();

        threey = three.y()+1;
        threex = three.x()+1;
    }

    @Override
    public void rotateClockwiseCase3() {
        zeroy = zero.y()+2;
        zerox = zero.x();

        oney = one.y()+1;
        onex = one.x()-1;

        twoy = two.y();
        twox = two.x();

        threey = three.y()-1;
        threex = three.x()+1;
    }

    public String toString(){
        return "tetris.J-piece";
    }
}