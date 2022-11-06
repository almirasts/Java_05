import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    //1. Positive testing Happy path
    //if (num % 2 == 0) {
    //return "Even";

    //num is even
    @Test
    public void testEvenNumber_HappyPath() {
        ///AAA
        //arrange
        int num = 222222;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(num);

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    //num is odd
    @Test
    public void testOddNumber_HappyPath() {
        ///AAA
        //arrange
        int num = -345;
        String expectedResult = "Odd";

        //act
        String actualResult = new OddEven().oddEven(num);

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    //num = 0
    @Test
    public void testZero_HappyPath() {
        ///AAA
        //arrange
        int num = 0;
        String expectedResult = "Even";

        //act
        String actualResult = new OddEven().oddEven(num);

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }



}
