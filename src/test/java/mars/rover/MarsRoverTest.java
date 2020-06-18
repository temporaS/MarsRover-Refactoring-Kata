package mars.rover;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MarsRoverTest {

    @Test
    public void
    acceptance_test_1() {
        String newPosition = MarsRover.move(1, 2, 'N', "LMLMLMLMM");
        assertEquals("1 3 N", newPosition);
    }

    @Test
    public void
    acceptance_test_2() {
        String newPosition = MarsRover.move(3, 3, 'E', "MMRMMRMRRM");
        assertEquals("5 1 E", newPosition);
    }

    @Test
    public void
    acceptance_test_3() {
        String newPosition = MarsRover.move(3, 3, 'S', "M");
        assertEquals("3 2 S", newPosition);
    }

    @Test
    public void
    acceptance_test_4() {
        String newPosition = MarsRover.move(3, 3, 'W', "M");
        assertEquals("2 3 W", newPosition);
    }

    @Test
    public void
    acceptance_test_5() {
        String newPosition = MarsRover.move(3, 3, 'E', "M");
        assertEquals("4 3 E", newPosition);
    }

    @Test
    public void
    acceptance_test_6() {
        String newPosition = MarsRover.move(3, 3, 'N', "M");
        assertEquals("3 4 N", newPosition);
    }

    @Test
    public void
    acceptance_test_7() {
        String newPosition = MarsRover.move(3, 3, 'S', "LLLLM");
        assertEquals("3 2 S", newPosition);
    }

    @Test
    public void
    acceptance_test_8() {
        String newPosition = MarsRover.move(3, 3, 'W', "RRRRM");
        assertEquals("2 3 W", newPosition);
    }

    @Test
    public void
    acceptance_test_9() {
        String newPosition = MarsRover.move(3, 3, 'E', "LLLLM");
        assertEquals("4 3 E", newPosition);
    }

    @Test
    public void
    acceptance_test_10() {
        String newPosition = MarsRover.move(3, 3, 'N', "RRRRM");
        assertEquals("3 4 N", newPosition);
    }

    @Test
    public void
    acceptance_test_11() {
        String newPosition = MarsRover.move(3, 3, 'S', "LM");
        assertEquals("4 3 E", newPosition);
    }

    @Test
    public void
    acceptance_test_12() {
        String newPosition = MarsRover.move(3, 3, 'N', "RM");
        assertEquals("4 3 E", newPosition);
    }

}