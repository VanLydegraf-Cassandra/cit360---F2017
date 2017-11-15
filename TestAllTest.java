package junittesting;

import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Cassandra
 */
public class TestAllTest {
    
    public TestAllTest() {
    }
    
    @Test
    public void assertThat1(){
        System.out.println("assertThat");
        assertThat("What! It worked", "a", is("a"));
    }
    
    @Test
    public void assertSame1() {
        System.out.println("compareString-same");
        String one = "Morning";
        String two = "Morning";
        assertSame(one, two);
    }
    
    @Test
    public void assertNotSame1() {
        System.out.println("compareString-notsame");
        String one = "Morning";
        String two = "Night";
        assertNotSame(one, two);
    }

    @Test
    public void assertEqual1() {
        System.out.println("add-equals");
        String stringOne = "2";
        String stringTwo = "2";
        TestAssertEquals instance = new TestAssertEquals();
        int expResult = 4;
        int result = instance.add(stringOne, stringTwo);
        assertEquals(expResult, result);
    }
    
    @Test
    public void assertNotNull1() {
        System.out.println("add-notnull");
        String stringOne = "2";
        String stringTwo = "2";
        TestAssertEquals instance = new TestAssertEquals();
        int result = instance.add(stringOne, stringTwo);
        assertNotNull(result);
    }
    
    @Test
    public void assertNull1() {
        System.out.println("concatString-null");
        String one = null;
        String two = null;
        assertNull(one, two);
    }    

    @Test
    public void assertEqual2() {
        System.out.println("concatString-equals");
        String one = "Hello";
        String two = "Friend";
        TestAssertArrayEquals instance = new TestAssertArrayEquals();
        String expResult = "HelloFriend";
        String result = instance.concatString(one, two);
        assertEquals(expResult, result);
    }

    @Test
    public void assertEqual3() {
        System.out.println("compareString-equals");
        String one = "Morning";
        String two = "Night";
        TestAssertArrayEquals instance = new TestAssertArrayEquals();
        boolean expResult = false;
        boolean result = instance.compareString(one, two);
        assertEquals(expResult, result);
    }

    @Test
    public void assertArrayEqual1() {
        System.out.println("addOneToArray-arrayequals");
        int[] numbers = new int[]{2,3};
        TestAssertArrayEquals instance = new TestAssertArrayEquals();
        int[] expResult = new int[]{3,4};
        int[] result = instance.addOneToArray(numbers);
        assertArrayEquals(expResult, result);
    }

    @Test
    public void assertTrue1() {
        System.out.println("compareString-true");
        String one = "Morning";
        String two = "Morning";
        TestAssertArrayEquals instance = new TestAssertArrayEquals();
        assertTrue(instance.compareString(one, two));
    }

        @Test
    public void assertFalse1() {
        System.out.println("compareString-false");
        String one = "Morning";
        String two = "Night";
        TestAssertArrayEquals instance = new TestAssertArrayEquals();
        assertFalse(instance.compareString(one, two));
    }
}
