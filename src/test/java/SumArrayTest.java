import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testFirstSumOfArrays_HappyPath() {
        ///AAA
        //arrange
        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(expectedResult, actualResult);
        
    }

    @Test
    public void testSecondSumOfArrays_HappyPath() {
        ///AAA
        //arrange
        int[] array = {-7, -3};
        int expectedResult = -10;

        //act
        int actualResult = new SumArray().sumArray(array);

        //assert
        Assert.assertEquals(expectedResult, actualResult);

    }
}
