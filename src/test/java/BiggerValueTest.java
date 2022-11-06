import org.testng.Assert;
import org.testng.annotations.Test;

public class BiggerValueTest {

    @Test
    public void testBiggerValue_HappyPath() {
        ///AAA
        //arrange
        int one = 3333;
        int two = 9999;
        int expectedResult = 9999;

        //act
        int actualResult = new BiggerValue().biggerValue(one, two);

        //assert
        Assert.assertEquals(expectedResult, actualResult);
    }
}
