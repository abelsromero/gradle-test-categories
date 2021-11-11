package gradle.test.categories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(ACategory.class)
public class ATest {

    static final String EXPECTED = "this is test A";

    @Test
    public void should_run_test_a() {
        String result = "this is test A";

        Assert.assertEquals(EXPECTED, result);
    }
}
