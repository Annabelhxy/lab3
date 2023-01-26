import static org.junit.Assert.*;
import org.junit.*;

public class ListTests {
    @Test 
	public void testReverseInPlace() {
    int[] input1 = {1, 2, 3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3, 2, 1}, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));

    int[] input2 = {1, 2, 3};
    assertArrayEquals(new int[]{3, 2, 1}, ArrayExamples.reversed(input2));
  }

  @Test
  public void testaverageWithoutLowest() {
    double[] input1 = { };
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0.01);

    double[] input2 = {1.0, 2.0, 3.0, 4.0};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input2), 0.01);
  }
}
