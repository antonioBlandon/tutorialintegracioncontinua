package co.com.ceiba.tutorialintegracioncontinua.helper.helper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import co.com.ceiba.tutorialintegracioncontinua.helper.TextHelper;

import static org.junit.Assert.*;

public class TextHelperTest {

    private TextHelper helper = null;

    @Before
    public void setUp(){
        helper = TextHelper.getInstance();
    }

    @After
    public void tearDown() throws Exception{
        helper = null;
    }

    @Test
    public void testGetText(){
        Assert.assertEquals(helper.getText(49),"low");
    }

}