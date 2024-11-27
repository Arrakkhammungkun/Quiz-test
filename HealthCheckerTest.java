import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HealthCheckerTest {

    @Test 
    public void TC_1(){
        int billWater =Quiz.calculateWater(150, 200);
        int bilEle = Quiz.calculateElectric(150, 200);
        int sum =Quiz.SumPrice(billWater, bilEle);

        assertEquals(2050,Quiz.calculateBill("Single Bed", sum));
    }
    @Test 
    public void TC_2(){
        int billWater =Quiz.calculateWater(150, 200);
        int bilEle = Quiz.calculateElectric(150, 200);
        int sum =Quiz.SumPrice(billWater, bilEle);

        assertEquals(2550,Quiz.calculateBill("Double Bed", sum));
    }
    @Test 
    public void TC_3(){


        assertEquals(250,Quiz.calculateWater(150, 200));
    }
    @Test 
    public void TC_4(){


        assertEquals(300,Quiz.calculateElectric(150, 200));
    }
    @Test 
    public void TC_5(){


        assertEquals(550,Quiz.SumPrice(250, 300));
    }
    @Test 
    public void TC_6(){


        assertEquals(2050,Quiz.calculateBill("Single Bed", 550));
    }
    @Test 
    public void TC_7(){


        assertEquals(2550,Quiz.calculateBill("Double Bed", 550));
    }
}
