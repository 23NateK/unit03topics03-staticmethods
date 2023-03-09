import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
public class TestTimeDuration {

    @Test
    public void testParseFromString(){
        //Test 1
        TimeDuration expected,acual;
        expected= new TimeDuration(7,2,4);
        acual= TimeDuration.parseFromString("7 h, 2m, 4 s");
        assertEquals(expected, acual);
        //Test 2
        expected= new TimeDuration(7,2,4);
        acual= TimeDuration.parseFromString("7:2:4");
        assertEquals(expected, acual);
        //Test 3
        expected= new TimeDuration(0,2,4);
        acual= TimeDuration.parseFromString("2:4");
        assertEquals(expected, acual);
        //Test 4
        expected= new TimeDuration(0,2,4);
        acual= TimeDuration.parseFromString("2m,4 s");
        assertEquals(expected, acual);
        //Test 5
        expected= new TimeDuration(0,0,4);
        acual= TimeDuration.parseFromString("4 s");
        assertEquals(expected, acual);

    }
}
