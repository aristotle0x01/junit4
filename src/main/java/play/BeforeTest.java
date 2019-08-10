package play;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * results like:
 *
 * .setup:1
 * t1  2
 * .setup:1
 * t2  1
 *
 * ???t1 ? t2?????new BeforeTest
 * ??before???????
 */
public class BeforeTest {
    private List<String> list = new ArrayList<String>();

    @Before
    public void setup() {
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
