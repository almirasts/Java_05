import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    //even numbers
    @Test
    public void testEvenNumbers_HappyPath() {
        int a = 89;
        int b = 89;
        int expectedResult = 0;

        int actualResult = new AreNumbersEqual().areNumberEqual(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void aSmallerThanB_HappyPath() {
        int a = -89;
        int b = 89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumberEqual(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void aBiggerThanB_HappyPath() {
        int a = 89;
        int b = -89;
        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumberEqual(a, b);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
