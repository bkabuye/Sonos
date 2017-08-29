import static org.junit.Assert.*;

public class SonosTest {
    int[] data = null, empty = null;
    Sonos sonos;
    @org.junit.Before
    public void setUp() throws Exception {
        data = new int[]{10, 23, 2, 22, 9, 8, 7, 200 };
        sonos = new Sonos();
    }

    @org.junit.Test
    public void lowestValue() throws Exception {
        int lowestnumber = sonos.lowestValue(data);
        assertEquals(2, lowestnumber);
        System.out.println(String.format("lowest value is %s", lowestnumber));
        lowestnumber = sonos.lowestValue(empty);
        assertEquals(0, lowestnumber);
        System.out.println(String.format("First method, Empty list is %s", lowestnumber));

        int secondnumber = sonos.secondlowest(data);
        assertEquals(7, secondnumber);
        System.out.println(String.format("Second lowest value is %s", secondnumber));
        secondnumber = sonos.secondlowest(empty);
        assertEquals(0, secondnumber);
        System.out.println(String.format("Second method, Empty list is %s", secondnumber));

    }


}