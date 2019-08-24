package play;

import org.junit.Test;

public class JUnitCoreTest2 {
    @Test
    public void shouldAddFailuresToResult() {
        System.out.println("hello world junit");

        Object[] o1 = new Object[2];
        o1[0] = "0";
        o1[1] = "2";

        Object[] o2 = o1;
        o2[1] = "2";
        int i =1;
    }


    @Test
    public void shouldAddFailuresToResult1() {
        System.out.println("hello world junit1111");
    }

}
