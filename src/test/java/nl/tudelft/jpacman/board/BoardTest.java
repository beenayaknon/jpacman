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
//     @Test
//     public void testGetWidth() {
//         assertThat(board.getWidth()).isEqualTo(1);
//     }
    
// /** Test.
//     * a
//     * a
//     */
//     @Test
//     public void testGetHeight() {
//         assertThat(board.getHeight()).isEqualTo(1);
//     }

// /** Test.
//     * a
//     * a
//     */
//     @Test
//     public void testSquareAt() {
//         Square square = board.squareAt(0, 0);
//         assertThat(square).isNotNull();
//     }

// /** Test.
//     * a
//     * a
//     */
//     @Test
//     public void testSquareAtNull() {
//         Square square = boardNull.squareAt(0, 0);
//         assertThat(square).isNull();
//     }

    /**
     * Tests the board's behavior when accessing a square at specific coordinates,
     * ensuring that squareAt returns the expected square from the grid.
     */
    @Test
    void testBoardWithOneNullSquare() {
        Square basicSquare = new BasicSquare();
        Square[][] basicGrid = new Square[1][1];
        basicGrid[0][0] = basicSquare;
        Board board = new Board(basicGrid);

        // Assert that squareAt(0, 0) returns the correct square from grid
        assertThat(board.squareAt(0, 0)).isEqualTo(basicGrid[0][0]);
    }
    
}
