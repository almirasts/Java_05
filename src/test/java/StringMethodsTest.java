import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    @Test
    public void testPhraseWithSpaces_HappyPath() {
        String phrase = "    Red Rover School   ";
        String expectedResult = "Лишние пробелы удалены";
        String actualResult = new StringMethods().removeSpaces(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testPhraseWithoutSpaces_HappyPath() {
        String phrase = "Red Rover School";
        String expectedResult = "Пробелов не было";
        String actualResult = new StringMethods().removeSpaces(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyString_HappyPath() {
        String phrase = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeSpaces(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoAsAndSpace_HappyPath() {
        String phrase = "    Red Rover School   ";
        String expectedResult = "Red Rover School";
        String actualResult = new StringMethods().removeAllAs(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testTwoAsAndSpace_HappyPath() {
        String phrase = "panda   ";
        String expectedResult = "pnd";
        String actualResult = new StringMethods().removeAllAs(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSixAsAndNoSpace_HappyPath() {
        String phrase = "taramasalata";
        String expectedResult = "trmslt";
        String actualResult = new StringMethods().removeAllAs(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoString_NegativePath() {
        String phrase = "";
        String expectedResult = "Строка пустая";
        String actualResult = new StringMethods().removeAllAs(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZerosAndSpace_HappyPath() {
        String phrase = "3504209706040000 ";
        String expectedResult = "35429764";
        String actualResult = new StringMethods().removeAllZeros(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testZerosAndNoSpace_HappyPath() {
        String phrase = "0000000111";
        String expectedResult = "111";
        String actualResult = new StringMethods().removeAllZeros(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoZeros_HappyPath() {
        String phrase = "111";
        String expectedResult = "This is a valid string";
        String actualResult = new StringMethods().removeAllZeros(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSpacesInsideAndOut_HappyPath() {
        String phrase = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";
        String actualResult = new StringMethods().removeAllSpaces(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testSpacesInsideOnly_HappyPath() {
        String phrase = "p a     n   d a   ";
        String expectedResult = "panda";
        String actualResult = new StringMethods().removeAllSpaces(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testEmptyString_NegativePath() {
        String phrase = "";
        String expectedResult = "String is empty";
        String actualResult = new StringMethods().removeAllSpaces(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringWithAs_HappyPath() {
        String phrase = "Abracadabra";
        String expectedResult = "5, 6";
        String actualResult = new StringMethods().countAs(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringWithNoAs_HappyPath() {
        String phrase = "Homenum Revelio";
        String expectedResult = "0, 15";
        String actualResult = new StringMethods().countAs(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testStringWithAsAndNumber_HappyPath() {
        String phrase = "3 tarAmasAlatA";
        String expectedResult = "6, 8";
        String actualResult = new StringMethods().countAs(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testContainsJava_HappyPath() {
        String phrase = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current "
                + "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy "
                + "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support "
                + "Java 8 with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost "
                + "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        boolean expectedResult = true;
        boolean actualResult = new StringMethods().countJava(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testNoJava_HappyPath() {
        String phrase = "99 little bugs in a code.\n"
                + "99 little bugs in a code.\n"
                + "Take one down, and patch it around.\n"
                + "235 critical bugs in the code";
        boolean expectedResult = false;
        boolean actualResult = new StringMethods().countJava(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testInsertQuotes_HappyPath() {
        String phrase = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";
        String actualResult = new StringMethods().insertQuotes(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityLowerCase_HappyPath() {
        String phrase = "ташкент";
        String expectedResult = "Ташкент";
        String actualResult = new StringMethods().fixCityName(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void testCityVariousCase_HappyPath() {
        String phrase = "ЧикаГО";
        String expectedResult = "Чикаго";
        String actualResult = new StringMethods().fixCityName(phrase);

        Assert.assertEquals(actualResult, expectedResult);
    }



}
