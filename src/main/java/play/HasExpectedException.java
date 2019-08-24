package play;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.hamcrest.core.StringStartsWith.startsWith;

public class HasExpectedException {
    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void throwsNothing() {
        // expect ?????????????????ExpectedException?????????????????
        // ExpectedException ExpectedExceptionStatement.evaluate?????statement?????
        thrown.expect(ArithmeticException.class);
        int i = 1/0;
    }

    @Test
    public void throwsNullPointerException() {
        thrown.expect(NullPointerException.class);
        throw new NullPointerException();
    }

    @Test
    public void throwsNullPointerExceptionWithMessage() {
        thrown.expect(NullPointerException.class);
        thrown.expectMessage("happened?");
        thrown.expectMessage(startsWith("What"));
        throw new NullPointerException("What happened?");
    }
}