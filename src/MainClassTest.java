import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainClassTest {
    @Test
    public void testGetLocalNumber(){
        MainClass mainClass = new MainClass();
        int actualNumber = mainClass.getLocalNumber();
        int expectedNumber = 14;
        assertEquals("getLocalNumber() Метод который должен возвращать 14",expectedNumber,actualNumber);
    }
}
