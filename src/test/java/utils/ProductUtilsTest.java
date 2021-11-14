package utils;

import org.junit.Assert;
import org.junit.Test;

public class ProductUtilsTest {

    @Test
    public void testGenerateIdReturnsUUID() {
        // given

        // when
        String uuid = ProductUtils.generateId();

        // then
        Assert.assertEquals(36, uuid.length());

    }
}