import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Tests {

    @Test
    public void testDay1() {
        Day day = new Day1();
        assertEquals(2769675, day.task1(false));
        assertEquals(24643097, day.task2(false));
    }

    @Test
    public void testDay2() {
        Day day = new Day2();
        assertEquals(2, day.task1(true));
        assertEquals(510, day.task1());
        assertEquals(4, day.task2(true));
        assertEquals(553, day.task2());
    }

    @Test
    public void testDay3() {
        Day day = new Day3();
        assertEquals(182619815, day.task1());
        assertEquals(80747545, day.task2());
    }
}
