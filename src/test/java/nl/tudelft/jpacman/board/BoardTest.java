package nl.tudelft.jpacman.board;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
/** Test.
    * a
    * a
    */
public class BoardTest {
    
    private Board board;
    private Square[][] grid;
    private Board boardNull;
    private Square[][] gridNull;

    /** Test.
    * a
    * a
    */
    @BeforeEach
    public void setUp() {
        grid = new Square[1][1];
        grid[0][0] = new BasicSquare();
        board = new Board(grid);

/** Test.
    * a
    * a
    */
        gridNull = new Square[1][1];
        gridNull[0][0] = null;
        boardNull = new Board(gridNull);
    }

/** Test.
    * a
    * a
    */
    @Test
    public void testGetWidth() {
        assertThat(board.getWidth()).isEqualTo(1);
    }
    
/** Test.
    * a
    * a
    */
    @Test
    public void testGetHeight() {
        assertThat(board.getHeight()).isEqualTo(1);
    }

/** Test.
    * a
    * a
    */
    @Test
    public void testSquareAt() {
        Square square = board.squareAt(0, 0);
        assertThat(square).isNotNull();
    }

/** Test.
    * a
    * a
    */
    @Test
    public void testSquareAtNull() {
        Square square = boardNull.squareAt(0, 0);
        assertThat(square).isNull();
    }
}
