package org.basic.utils;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilsTest {
    
    @Test
    public void isEmptyStringPositiveTest() {
        boolean result = StringUtils.isEmptyString("test");
        Assert.assertFalse(result);
    }

    @Test
    public void isEmptyStringNegativeTest() {
        boolean result = StringUtils.isEmptyString(null);
        Assert.assertTrue(result);
    }

    @Test
    public void isEmptyStringLengthNegativeTest() {
        boolean result = StringUtils.isEmptyString("");
        Assert.assertTrue(result);
    }
}
