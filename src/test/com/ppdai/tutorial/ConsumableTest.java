package test.com.ppdai.tutorial;

import com.ppdai.tutorial.Consumable;
import com.ppdai.tutorial.Item;
import org.junit.*;

/**
 * Consumable Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>六月 29, 2017</pre>
 */
public class ConsumableTest {
    private static final double weight = 0.4527;
    private static final int valueMultiplier = 247;
    private static Consumable consumer1, consumer2;
    //private static Item[] sameValueItems; //相同value，不同name

    @BeforeClass
    public static void setUp() {
        System.out.println("setUp BeforeClass ");
        consumer1 = new Consumable("consumer1", 10, 10, false) {
            @Override
            public String eat() {
                return null;
            }
        };
        consumer2 = new Consumable("consumer2", 11, 11, true) {
            @Override
            public String eat() {
                return null;
            }
        };
    }

    @Before
    public void before() throws Exception {

    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: eat()
     */
    @Test
    public void testEat() throws Exception {
        Assert.assertEquals("", consumer1.eat());
    }

    /**
     * Method: use()
     */
    @Test
    public void testUse() throws Exception {
        Assert.assertEquals("", consumer1.use());
    }

    /**
     * Method: isConsumed()
     */
    @Test
    public void testIsConsumed() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: setConsumed(boolean consumed)
     */
    @Test
    public void testSetConsumed() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: isSpoiled()
     */
    @Test
    public void testIsSpoiled() throws Exception {
//TODO: Test goes here... 
    }

    /**
     * Method: toString()
     */
    @Test
    public void testToString() throws Exception {
//TODO: Test goes here... 
    }


} 
