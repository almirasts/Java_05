import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class OddIndicesTest {

    //1. Positive testing Happy path
    //if (array[i] % 2 != 0) {
    //result[i] = array[i];

    @Test
    public void testArrayOddNumbers_HappyPath() {
        ///AAA
        //arrange
        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult2 = {590, 985, 68};

        //act
        int[] actualResult = new OddIndices().oddIndices();

        //assert
        Assert.assertEquals(expectedResult2, actualResult);
    }
}
