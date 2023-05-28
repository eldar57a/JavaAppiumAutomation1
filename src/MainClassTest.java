import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainClassTest {
    @Test
    public void testGetClassNumber(){
        MainClass mainClass = new MainClass();
        int classNumber = mainClass.getClassNumber();
        assertTrue("getClassNumber() Этот метод должен возвращать больше 45",classNumber > 45);
    }
}
