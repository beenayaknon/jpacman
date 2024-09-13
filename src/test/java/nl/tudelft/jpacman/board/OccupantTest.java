package nl.tudelft.jpacman.board;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;
    private Square targetSquare;
    private Square targetSquare2;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
        targetSquare = new BasicSquare();
        targetSquare2 = new BasicSquare();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        assertThat(unit.hasSquare()).isEqualTo(false);
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        unit.occupy(targetSquare);
        assertThat(unit.getSquare()).isEqualTo(targetSquare);
        assertThat(targetSquare.getOccupants().contains(unit)).isEqualTo(true);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        unit.occupy(targetSquare);
        assertThat(unit.getSquare()).isEqualTo(targetSquare);
        assertThat(targetSquare.getOccupants().contains(unit)).isEqualTo(true);

        unit.occupy(targetSquare2);
        assertThat(unit.getSquare()).isEqualTo(targetSquare2);
        assertThat(targetSquare2.getOccupants().contains(unit)).isEqualTo(true);
        assertThat(targetSquare.getOccupants().contains(unit)).isEqualTo(false);
    }
}
