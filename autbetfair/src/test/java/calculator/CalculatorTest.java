package calculator;

import org.junit.*;

public class CalculatorTest {
    static Calculator c;

    @BeforeClass
    public static void setUp() {
        System.out.println("Set up Testing variables");
        c = new Calculator();
    }

    @Before
    public void beforeMethod() {
        System.out.println("This method runs before each test");
    }

    @Test
    public void myTestMethod() {
        System.out.println("Hello world from Testing");
    }

    @Test
    public void verifyAdditionComputeTest() {
        System.out.println("\nVerify addition works accordingly");
        System.out.println("\nVerify addition with integer numbers");
        Assert.assertEquals(1, c.compute(-2, 3, "+"), 3);
        Assert.assertEquals(-1, c.compute(-3, 2, "+"), 3);
        Assert.assertEquals(5, c.compute(3, 2, "+"), 3);
        Assert.assertEquals(-1, c.compute(2, -3, "+"), 3);

        System.out.println("Verify addition with float numbers");
        Assert.assertEquals(1.0, c.compute(-2.0, 3.0, "+"), 3);
        Assert.assertEquals(-1.0, c.compute(-3.0, 2.0, "+"), 3);
        Assert.assertEquals(5.0, c.compute(3.0, 2.0, "+"), 3);
        Assert.assertEquals(-1.0, c.compute(2.0, -3.0, "+"), 3);

        System.out.println("Verify subtraction with one integer and one float numbers\n");
        Assert.assertEquals(1.0, c.compute(-2, 3.0, "+"), 3);
        Assert.assertEquals(-1.0, c.compute(-3.0, 2, "+"), 3);
        Assert.assertEquals(5.0, c.compute(3, 2.0, "+"), 3);
        Assert.assertEquals(-1.0, c.compute(2.0, -3, "+"), 3);
        Assert.assertEquals(1, c.compute(-2, 3.0, "+"), 3);
        Assert.assertEquals(-1, c.compute(-3.0, 2, "+"), 3);
        Assert.assertEquals(5, c.compute(3, 2.0, "+"), 3);
        Assert.assertEquals(-1, c.compute(2.0, -3, "+"), 3);
    }

    @Test
    public void verifySubtractionComputeTest() {
        System.out.println("\nVerify subtraction works accordingly");
        System.out.println("\nVerify subtraction with integer numbers");
        Assert.assertEquals(-5, c.compute(-2, 3, "-"), 3);
        Assert.assertEquals(-5, c.compute(-3, 2, "-"), 3);
        Assert.assertEquals(1, c.compute(3, 2, "-"), 3);
        Assert.assertEquals(5, c.compute(2, -3, "-"), 3);

        System.out.println("Verify subtraction with float numbers");
        Assert.assertEquals(-5.0, c.compute(-2.0, 3.0, "-"), 3);
        Assert.assertEquals(-5.0, c.compute(-3.0, 2.0, "-"), 3);
        Assert.assertEquals(1.0, c.compute(3.0, 2.0, "-"), 3);
        Assert.assertEquals(5.0, c.compute(2.0, -3.0, "-"), 3);

        System.out.println("Verify subtraction with one integer and one float numbers\n");
        Assert.assertEquals(-5.0, c.compute(-2, 3.0, "-"), 3);
        Assert.assertEquals(-5.0, c.compute(-3.0, 2, "-"), 3);
        Assert.assertEquals(1.0, c.compute(3, 2.0, "-"), 3);
        Assert.assertEquals(5.0, c.compute(2.0, -3, "-"), 3);
        Assert.assertEquals(-5, c.compute(-2, 3.0, "-"), 3);
        Assert.assertEquals(-5, c.compute(-3.0, 2, "-"), 3);
        Assert.assertEquals(1, c.compute(3, 2.0, "-"), 3);
        Assert.assertEquals(5, c.compute(2.0, -3, "-"), 3);
    }

    @Test
    public void verifyMultiplicationComputeTest() {
        System.out.println("\nVerify multiplication works accordingly");
        System.out.println("\nVerify multiplication with integer numbers");
        Assert.assertEquals(6, c.compute(3, 2, "*"), 3);
        Assert.assertEquals(6, c.compute(-2, -3, "*"), 3);
        Assert.assertEquals(-6, c.compute(-2, 3, "*"), 3);
        Assert.assertEquals(-6, c.compute(2, -3, "*"), 3);


        System.out.println("Verify multiplication with float numbers");
        Assert.assertEquals(6.0, c.compute(3.0, 2.0, "*"), 3);
        Assert.assertEquals(6.0, c.compute(-2.0, -3.0, "*"), 3);
        Assert.assertEquals(-6.0, c.compute(-2.0, 3.0, "*"), 3);
        Assert.assertEquals(-6.0, c.compute(2.0, -3.0, "*"), 3);


        System.out.println("Verify multiplication with one integer and one float numbers\n");
        Assert.assertEquals(6.0, c.compute(3, 2.0, "*"), 3);
        Assert.assertEquals(6.0, c.compute(-2.0, -3, "*"), 3);
        Assert.assertEquals(-6.0, c.compute(-2, 3.0, "*"), 3);
        Assert.assertEquals(-6.0, c.compute(2.0, -3, "*"), 3);
        Assert.assertEquals(6, c.compute(3, 2.0, "*"), 3);
        Assert.assertEquals(6, c.compute(-2.0, -3, "*"), 3);
        Assert.assertEquals(-6, c.compute(-2, 3.0, "*"), 3);
        Assert.assertEquals(-6, c.compute(2.0, -3, "*"), 3);
    }

    @Test
    public void verifyDivisionComputeTest1() {
        System.out.println("\nVerify division works accordingly");
        System.out.println("\nVerify division with integer numbers");
        Assert.assertEquals(2, c.compute(4, 2, "/"), 3);
        Assert.assertEquals(2, c.compute(-6, -3, "/"), 3);
        Assert.assertEquals(-1, c.compute(-3, 3, "/"), 3);
        Assert.assertEquals(-1, c.compute(3, -3, "/"), 3);
        Assert.assertEquals(1.5, c.compute(3, 2, "/"), 3);
        Assert.assertEquals(-1.5, c.compute(3, -2, "/"), 3);
        Assert.assertEquals(-1.5, c.compute(-3, 2, "/"), 3);
        Assert.assertEquals(1.5, c.compute(-3, -2, "/"), 3);


        System.out.println("Verify division with float numbers");
        Assert.assertEquals(2.0, c.compute(4.0, 2.0, "/"), 3);
        Assert.assertEquals(2.0, c.compute(-6.0, -3.0, "/"), 3);
        Assert.assertEquals(-1.0, c.compute(-3.0, 3.0, "/"), 3);
        Assert.assertEquals(-1.0, c.compute(3.0, -3.0, "/"), 3);
        Assert.assertEquals(1.5, c.compute(3.0, 2.0, "/"), 3);
        Assert.assertEquals(-1.5, c.compute(3.0, -2.0, "/"), 3);
        Assert.assertEquals(-1.5, c.compute(-3.0, 2.0, "/"), 3);
        Assert.assertEquals(1.5, c.compute(-3.0, -2.0, "/"), 3);


        System.out.println("Verify division with one integer and one float numbers\n");
        Assert.assertEquals(2.0, c.compute(4, 2.0, "/"), 3);
        Assert.assertEquals(1.0, c.compute(-3.0, -3, "/"), 3);
        Assert.assertEquals(-2.0, c.compute(-6, 3.0, "/"), 3);
        Assert.assertEquals(-1.0, c.compute(3.0, -3, "/"), 3);
        Assert.assertEquals(2, c.compute(4, 2.0, "/"), 3);
        Assert.assertEquals(1, c.compute(-3.0, -3, "/"), 3);
        Assert.assertEquals(-2, c.compute(-6, 3.0, "/"), 3);
        Assert.assertEquals(-1, c.compute(3.0, -3, "/"), 3);
        Assert.assertEquals(1.5, c.compute(3, 2.0, "/"), 3);
        Assert.assertEquals(-1.5, c.compute(3.0, -2, "/"), 3);
        Assert.assertEquals(-1.5, c.compute(-3, 2.0, "/"), 3);
        Assert.assertEquals(1.5, c.compute(-3.0, -2, "/"), 3);
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyDivisionComputeTest2() {
        System.out.println("Verify division by 0");
        c.compute(3, 0, "/");
        c.compute(-3, 0, "/");
        c.compute(3.0, 0, "/");
        c.compute(-3.0, 0, "/");
    }

    @Test
    @Ignore
    public void verifyUnsupportedOperation() {
        try {
            c.compute(2, 5.4, "+");
            System.out.println("Method do not return exception as expected");
            Assert.fail();
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(true);
        } catch (Exception e) {
            System.out.println("We are expected to receive IllegalArgumentException");
            Assert.fail();
        }
    }

    @Test(expected = IllegalArgumentException.class)
    public void verifyUnsupportedOperation2() {
        c.compute(2, 5.4, "test");
    }

    @Test
    public void verifySQRTComputeTest1() {
        System.out.println("\nVerify SQRT works accordingly");
        System.out.println("\nVerify SQRT with positive integer numbers");
        Assert.assertEquals(2, c.compute(4, 2, "SQRT"), 3);
        Assert.assertEquals(1.71, c.compute(3, 2, "SQRT"), 3);

        System.out.println("\nVerify SQRT with positive float numbers");
        Assert.assertEquals(2.0, c.compute(4.0, 2, "SQRT"), 3);
        Assert.assertEquals(2, c.compute(4.0, 2.0, "SQRT"), 3);
    }

    @Test
    public void verifySQRTComputeTest2() {
        try {
            System.out.println("\nVerify SQRT with negative integer numbers");
            c.compute(-4, 2, "SQRT");
            Assert.fail();
        }
        catch (AssertionError e) {
            Assert.assertTrue(true);
        }
        catch (Exception e) {
            System.out.println("We are expected to receive AssertionError");
            Assert.fail();
        }

        try {
            System.out.println("\nVerify SQRT with negative float numbers");
            c.compute(-4.0, 2.0, "SQRT");
            Assert.fail();
        }
        catch (AssertionError e) {
            Assert.assertTrue(true);
        }
        catch (Exception e) {
            System.out.println("We are expected to receive AssertionError");
            Assert.fail();
        }
    }

    @After
    public void afterMethod() {
        System.out.println("This method run after each test");
    }

    @AfterClass
    public static void cleanUp() {
        System.out.println("Clean up Testing variables");
        c = null;
    }

}
