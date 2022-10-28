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
        Assertions.assertTrue(op.checkString("0001"),"input contains char other than 1,0");
    }
    @Test
    @DisplayName("validate the string based on unwritten rule")
    void validateStringTest(){
        System.out.println("====== Harsha Vardhan Yallavula == TEST TWO EXECUTED =======");
        Assertions.assertTrue(op.validateString("0101"),"two or more people can urinate beside each other");
    }
}
