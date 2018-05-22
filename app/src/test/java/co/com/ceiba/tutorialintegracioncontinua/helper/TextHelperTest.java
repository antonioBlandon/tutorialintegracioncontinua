package co.com.ceiba.tutorialintegracioncontinua.helper;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextHelperTest {

    private TextHelper helper = null;

    @Test
    public void testGetText1(){
        helper = TextHelper.getInstance();
        Assert.assertEquals(helper.getText(50),"high");
    }

    @Test
    public void testGetText2(){
        helper = TextHelper.getInstance();
        Assert.assertEquals(helper.getText(0),"low");
    }

    @Test
    public void testGetText3(){
        helper = TextHelper.getInstance();
        Assert.assertNotNull(helper);
    }

}