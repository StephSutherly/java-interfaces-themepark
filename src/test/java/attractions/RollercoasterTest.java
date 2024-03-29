package attractions;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    RollerCoaster rollerCoaster;
    Visitor visitorMinor;
    Visitor visitorMajor;

    @Before
    public void setUp() {
        rollerCoaster = new RollerCoaster("Blue Ridge", 10);
        visitorMinor = new Visitor(12, 1.6, 20);
        visitorMinor = new Visitor(12, 1.2, 20);
        visitorMajor = new Visitor(18, 1.7, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Blue Ridge", rollerCoaster.getName());
    }

    @Test
    public void hasRating() {
        assertEquals(10, rollerCoaster.getRating());
    }

    @Test
    public void hasVisitCount() {
        assertEquals(0, rollerCoaster.getVisitCount());
    }

    @Test
    public void canIdentifyIfPassSecurity___falsex1() {
        assertEquals(false, RollerCoaster.isAllowedTo(visitor1));
    }

    @Test
    public void canIdentifyIfPassSecurity___falsex2() {
        assertEquals(false, RollerCoaster.isAllowedTo(visitor2));
    }

    @Test
    public void canIdentifyIfPassSecurity___true() {
        assertEquals(true, RollerCoaster.isAllowedTo(visitor3));
    }
}
