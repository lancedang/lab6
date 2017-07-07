package test.com.ppdai.tutorial;

import com.ppdai.tutorial.Item;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class ItemTest {
    private static final double weight = 0.4527;
    private static final int valueMultiplier = 247;
    private static Item[] items; //不同value
    private static Item[] sameValueItems; //相同value，不同name

    @BeforeClass
    public static void setup() {
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

        for(int i = 0; i < 5; i++) {
            sameValueItems[i] = new Item("a" + i, 11, 11) {
                @Override
                public String use() {
                    return "sameValueItem";
                }
            };
        }

    }

    @Test
    public void itemConstructorTest() {
        Assert.assertEquals(items[2].getName(), "2");
        Assert.assertEquals(items[2].getValue(), 2 * valueMultiplier);
        Assert.assertEquals(items[2].getWeight(), 2 + weight, 0.001);
    }

    @Test
    public void getItemIdTest() {
        for (int i = 0; i < 5; i++) {
            Assert.assertEquals(i, items[i].getId());
        }
    }

    @Test
    public void compareItemToTest() {
        Assert.assertTrue(items[1].compareTo(items[1]) == 0);
        Assert.assertTrue(items[1].compareTo(items[0]) > 0);
        Assert.assertTrue(items[0].compareTo(items[1]) < 0);

        //相同value不同name的比较
        Assert.assertTrue(sameValueItems[1].compareTo(sameValueItems[2]) < 0);

    }

    @Test
    /**
     * 相同value，不同name的比较
     */
    public void compareEqualItemsLexicographicallyTest() {
        Item lesser = new Item("a", items[1].getValue(),
                items[1].getWeight()) {
            @Override
            public String use() {
                // TODO Auto-generated method stub
                return null;
            }
        };

        Item greater = new Item("b", items[1].getValue(),
                items[1].getWeight()) {
            @Override
            public String use() {
                // TODO Auto-generated method stub
                return null;
            }
        };

        Assert.assertTrue(lesser.compareTo(greater) < 0);
    }

    @Test
    public void itemToStringTest() {
        Assert.assertEquals(String.format("%d -- Value: %d, Weight: %.2f",
                3, 3 * valueMultiplier, 3 + weight), items[3].toString());
    }

    @Test
    public void itemUseTest() {
        Assert.assertEquals("You use the item, it is good.",
                items[0].use());
        Assert.assertEquals("sameValueItem", sameValueItems[0].use());
    }

    @Test
    public void setItemNameTest() {
        items[0].setName("New Name");

        Assert.assertEquals("New Name", items[0].getName());
    }

    @Test
    public void setItemValueTest() {
        items[0].setValue(42);

        Assert.assertEquals(42, items[0].getValue());
    }

    @Test
    public void setItemWeightTest() {
        items[0].setWeight(5 + weight);

        Assert.assertEquals(5 + weight, items[0].getWeight(), 0.001);
    }
}
