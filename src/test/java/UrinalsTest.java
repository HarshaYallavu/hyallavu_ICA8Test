import org.ICA8.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class UrinalsTest {
    Operations op=new Operations();
    @Test
    @DisplayName("test the input")
    void checkStringTest(){
        System.out.println("====== Harsha Vardhan Yallavula == TEST ONE EXECUTED =======");
        Assertions.assertTrue(op.checkString("0002"),"input contains char other than 1,0");
    }
}
