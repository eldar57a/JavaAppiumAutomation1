import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class MainClassTest {
    @Test
    public void testGetClassString(){
        MainClass mainClass = new MainClass();
        String classString = mainClass.getClassString();
        assertTrue("getClassString() Метод должен возвращать строку Hello, World или hello, World", classString.startsWith("Hello") || classString.startsWith("hello"));
    }

}
