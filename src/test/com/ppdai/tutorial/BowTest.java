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
* @since <pre>���� 29, 2017</pre> 
* @version 1.0 
*/ 
public class BowTest {
    private static final double weight = 0.4527;
    private static final int valueMultiplier = 247;
    private static Item[] items; //��ͬvalue
    private static Item[] sameValueItems; //��ͬvalue����ͬname
@Before
public void before() throws Exception {
    Item.reset();

    items = new Item[5];
    sameValueItems = new Item[5];

    for (int i = 0; i < 5; i++) {
        //ѧϰ��ʼ�����԰����ķ�ʽ������һ����new������סabstract ��ͨ��������ʵ�����ķ�ʽ
        //ֻҪ��abstract�࣬��Ҫʵ��������ͨ��������ʵ�֣���������Ҫʵ��abstract��������
        //abstract �� ������ʵ����
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
