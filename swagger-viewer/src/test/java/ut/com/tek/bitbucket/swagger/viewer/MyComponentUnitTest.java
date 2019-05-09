package ut.com.tek.bitbucket.swagger.viewer;

import org.junit.Test;
import com.tek.bitbucket.swagger.viewer.api.MyPluginComponent;
import com.tek.bitbucket.swagger.viewer.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}