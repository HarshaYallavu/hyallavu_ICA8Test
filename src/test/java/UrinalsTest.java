import org.ICA8.Operations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.*;
import java.util.*;

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
    @Test
    @DisplayName("verify the max count of available urinals from the list")
    void countUrinalsTest(){
        System.out.println("====== Harsha Vardhan Yallavula == TEST THREE EXECUTED =======");
        Assertions.assertTrue(3==op.countUrinals("00000"),"incorrect number of available urinals");
    }
    @Test
    @DisplayName("verify if the file exist or not")
    void fileExistTest(){
        System.out.println("====== Harsha Vardhan Yallavula == TEST FOURTH EXECUTED =======");
        Assertions.assertTrue(true==op.fileExist(new File("./src/main/resources/Rule.txt")),"File is not empty");
    }
    @Test
    @DisplayName("verify whether a file is empty or not")
    void emptyFileTest(){
        System.out.println("====== Harsha Vardhan Yallavula == TEST FIVE EXECUTED =======");
        Assertions.assertTrue(true==op.emptyFile(new File("./src/main/resources/demo.txt")),"File doesn't exist");
    }
    @Test
    @DisplayName("check if there are any Bad Name files in the output directory")
    void badNameFileTest(){
        System.out.println("====== Harsha Vardhan Yallavula == TEST SIX EXECUTED =======");
        Assertions.assertTrue(false== op.badNameFile(new File("./src/main/resources/outputs")),"Directory contains badName files");
    }
}
