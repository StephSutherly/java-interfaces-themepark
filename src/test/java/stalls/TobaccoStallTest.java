package stalls;

import org.junit.Before;
import org.junit.Test;
import people.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitorMinor;
    Visitor visitorMajor;

    @Before
    public void setUp() throws Exception {
        tobaccoStall = new TobaccoStall("Jacks Drum", "Jack Jarvis", ParkingSpot.B1);
        visitorMinor = new Visitor(12, 1.2, 20);
        visitorMajor = new Visitor(18, 1, 5);
    }

    @Test
    public void hasName() {
        assertEquals("Jacks Drum", tobaccoStall.getName());
    }

    @Test
    public void hasOwner() {
        assertEquals("Jack Jarvis", tobaccoStall.getOwnerName());
    }

    @Test
    public void hasParkingSpot() {
        assertEquals(ParkingSpot.B1, tobaccoStall.getParkingSpot());
    }

    @Test
    public void canIdentifyMinor() {
        assertEquals(false, tobaccoStall.isAllowedTo(visitorMinor));
    }

    @Test
    public void canIdentifyMajor() {
        assertEquals(true, tobaccoStall.isAllowedTo(visitorMajor));
    }
}
