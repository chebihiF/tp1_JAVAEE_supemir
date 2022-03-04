import org.hibernate.SessionFactory;

import org.junit.Assert;
import org.junit.Test;
import supemir.irm.tp1.util.HibernateUtil;

import javax.validation.constraints.AssertTrue;

public class ProductTest {

    @Test
    public void connectionTest(){
        SessionFactory factory = HibernateUtil.getFACTORY();
        Assert.assertNotEquals(factory,null);
    }
}
