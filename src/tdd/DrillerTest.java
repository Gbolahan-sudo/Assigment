package tdd;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DrillerTest {
    @Before    public void setUp(){
        Driller driller = new Driller();
    }

    @Test
    public void testOfTwoThousandPerCopy(){
        double price1 =Driller.amount(1);
        double price2 =Driller.amount(2);
        double price3 =Driller.amount(3);
        double price4 =Driller.amount(4);

        assertEquals(2000.0, price1);
        assertEquals(2000.0, price2);
        assertEquals(2000.0, price3);
        assertEquals(2000.0, price4);
    }

    @Test
    public void testOfOneThousandEightHundredPerCopy(){
        double price1= Driller.amount(9);
        double price2= Driller.amount(8);
        double price3= Driller.amount(7);
        double price4= Driller.amount(6);

        assertEquals(1800, price1);
        assertEquals(1800, price2);
        assertEquals(1800, price3);
        assertEquals(1800, price4);
    }
    @Test
    public void testOfOneThousandSixHundredPerCopy(){
        double price1 = Driller.amount(29);
        double price2 = Driller.amount(28);
        double price3 = Driller.amount(27);
        double price4 = Driller.amount(26);
        assertEquals(1600, price1);
        assertEquals(1600, price2);
        assertEquals(1600, price3);
        assertEquals(1600, price4);
    }
    @Test
    public void testOneThousandFiveHundredPerCopy(){
        double price1 = Driller.amount(49);
        double price2 = Driller.amount(48);
        double price3 = Driller.amount(47);
        double price4 = Driller.amount(46);

        assertEquals(1500, price1);
        assertEquals(1500, price2);
        assertEquals(1500, price3);
        assertEquals(1500, price4);
    }
    @Test
    public void testOneThousandThreeHundredPerCopy(){
        double price1 = Driller.amount(99);
        double price2 = Driller.amount(98);
        double price3 = Driller.amount(97);
        double price4 = Driller.amount(96);

        assertEquals(1300, price1);
        assertEquals(1300, price2);
        assertEquals(1300, price3);
        assertEquals(1300, price4);
    }
    @Test
    public void testOneThousandTwoHundredPerCopy(){
        double price1 = Driller.amount(199);
        double price2 = Driller.amount(198);
        double price3 = Driller.amount(197);
        double price4 = Driller.amount(196);

        assertEquals(1200, price1);
        assertEquals(1200, price2);
        assertEquals(1200, price3);
        assertEquals(1200, price4);
    }
    @Test
    public void testOneThousandOneHundredPerCopy(){
        double price1 = Driller.amount(499);
        double price2 = Driller.amount(498);
        double price3 = Driller.amount(497);
        double price4 = Driller.amount(496);

        assertEquals(1100, price1);
        assertEquals(1100, price2);
        assertEquals(1100, price3);
        assertEquals(1100, price4);
    }

}
