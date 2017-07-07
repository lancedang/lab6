package test.com.ppdai.tutorial; 

import com.ppdai.tutorial.Bow;
import com.ppdai.tutorial.Item;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* Bow Tester. 
* 
* @author <Authors name> 
* @since <pre>六月 29, 2017</pre> 
* @version 1.0 
*/ 
public class BowTest {
    private static final double weight = 0.4527;
    private static final int valueMultiplier = 247;
    private static Item[] items; //不同value
    private static Item[] sameValueItems; //相同value，不同name
@Before
public void before() throws Exception {
    Item.reset();

    items = new Item[5];
    sameValueItems = new Item[5];

    for (int i = 0; i < 5; i++) {
        //学习初始化测试案例的方式（并非一个个new）；记住abstract 类通过匿名类实例化的方式
        //只要是abstract类，若要实例化必须通过匿名类实现（匿名类需要实现abstract方法），
        //abstract 类 本身不能实例化
        items[i] = new Item(Integer.toString(i), i * valueMultiplier, i + weight) {
            @Override
            public String use() {
                return "You use the item, it is good.";
            }
        };
    }
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: polish() 
* 
*/ 
@Test
public void testPolish() throws Exception {
    Bow bow = new Bow(10, 12, 3,10);
    bow.polish();
} 


} 
