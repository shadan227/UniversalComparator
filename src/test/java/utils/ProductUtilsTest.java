package utils;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.*;

public class ProductUtilsTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void testGenerateIdReturnsUUID() {
        // given

        // when
        String uuid = ProductUtils.generateId();

        // then
        Assert.assertEquals(36, uuid.length());

    }
}