package co.com.ceiba.tutorialintegracioncontinua.helper;

import org.junit.*;

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