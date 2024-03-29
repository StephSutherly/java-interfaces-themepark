package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {
    Playground playground;
    Visitor visitorMinor;
    Visitor visitorMajor;

    @Before
    public void setUp() throws Exception {
        playground = new Playground("Fun Zone", 7);
        visitorMinor = new Visitor(12, 1.2, 20);
        visitorMajor = new Visitor(18, 1, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Fun Zone", playground.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(7, playground.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, playground.getVisitCount());
    }

    @Test
    public void canIdentifyMinor() {
        assertEquals(true, playground.isAllowedTo(visitorMinor));
    }

    @Test
    public void canIdentifyMajor() {
        assertEquals(false, playground.isAllowedTo(visitorMajor));
    }

}
