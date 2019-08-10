package play;

import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * results like:
 *
 * setup:1
 * .new object play.BeforeClassTest@33c7353a for public void play.BeforeClassTest.t1()
 * t1  2
 * .new object play.BeforeClassTest@681a9515 for public void play.BeforeClassTest.t2()
 * t2  2
 *
 * ParentRunner.classBlock ????
 */
public class BeforeClassTest {
    private final static List<String> list = new ArrayList<String>();

    @BeforeClass
    public static void setup() {
        list.add("hello");
        System.out.println("setup:" + list.size());
    }

    @Test
    public void t1() {
        list.add("world");
        System.out.println("t1  " + list.size());
    }

    @Test
    public void t2() {
        System.out.println("t2  " + list.size());
    }

}
