package gradle.test.categories;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(BCategory.class)
public class BTest {

    static final String EXPECTED = "this is test B";

    @Test
    public void should_run_test_b() {
        String result = "this is test B";

        Assert.assertEquals(EXPECTED, result);
    }
}
