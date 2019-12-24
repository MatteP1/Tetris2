package tetris.tetrisGame.RotationStrategy;

import tetris.Framework.Position;
import tetris.Framework.Tetrimino;
import tetris.tetrisGame.GridElement;
import tetris.tetrisGame.RotationStrategy.IndividualPiecesRotationStrategy.*;

import java.util.Map;

public class IndividualPieceRotationStrategy implements RotationStrategy {

    RotationStrategy rotationI;
    RotationStrategy rotationJ;
    RotationStrategy rotationL;
    RotationStrategy rotationO;
    RotationStrategy rotationS;
    RotationStrategy rotationT;
    RotationStrategy rotationZ;
    RotationStrategy rotationState;

    public IndividualPieceRotationStrategy() {
        rotationI = new RotationI();
        rotationJ = new RotationJ();
        rotationL = new RotationL();
        rotationO = new RotationO();
        rotationS = new RotationS();
        rotationT = new RotationT();
        rotationZ = new RotationZ();
    }

    @Override
    public Map<GridElement, Position> rotateClockWise(Tetrimino tetrimino) {
        switchState(tetrimino);
        return rotationState.rotateClockWise(tetrimino);
    }

    @Override
    public Map<GridElement, Position> rotateCounterClockWise(Tetrimino tetrimino) {
        switchState(tetrimino);
        return rotationState.rotateCounterClockWise(tetrimino);
    }

    private void switchState(Tetrimino tetrimino) {
        switch (tetrimino.getType()) {
            case "I" : rotationState = rotationI; break;
            case "J" : rotationState = rotationJ; break;
            case "L" : rotationState = rotationL; break;
            case "O" : rotationState = rotationO; break;
            case "S" : rotationState = rotationS; break;
            case "T" : rotationState = rotationT; break;
            case "Z" : rotationState = rotationZ; break;
        }
    }

}
