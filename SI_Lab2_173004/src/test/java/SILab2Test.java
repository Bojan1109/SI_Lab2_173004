import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SILab2Test extends TestCase {

    SILab2 instance = new SILab2();

    @Test

     void everyStatementTest() {

        //A-B,B-C,C-D,D-E,E-G,G-H,H-J,J-K,k-B
        assertEquals(290420,instance.function((List<Angle>) new Angle(80,40,20)));
        //D-l,Q-R
        assertEquals("The angle is smaller or greater then the minimum",new  Angle(365,0,0));
        //E-F
        assertEquals("The minutes of the angle are not valid!",new Angle(90,60,30));
        //H-I
        assertEquals("The seconds of the angle are not valid", new Angle(180,50,60));
        //L-M,M-N,N-S
        assertEquals(1296000,new Angle(360,0,0));
        //L-M,M-O,O-P
        assertEquals("The angle is greater then the maximum",new Angle(360,55,0));

    }
}