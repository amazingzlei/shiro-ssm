import org.apache.shiro.crypto.hash.SimpleHash;
import org.junit.Test;

public class MyTest {
    @Test
    public void test01(){
        SimpleHash simpleHash = new SimpleHash("MD5","123456","zenglei",1);
        System.out.println(simpleHash.toString());
    }
    @Test
    public void test02(){
        int x = 2;
        int y = 8;
        System.out.println(x|y);
    }
}
