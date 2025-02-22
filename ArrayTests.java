import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  /******************************* Custom tests *******************************/
  @Test
  public void testReverseInPlaceNonEmpty() {
    int[] input2 =          {0,1,2,3,4,5,6,7,8,9};
    int[] input2Reversed =  {9,8,7,6,5,4,3,2,1,0};
    // test reversed long list
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(input2Reversed,input2);
  }

  @Test
  public void testReversedNonEmpty() {
    int[] input2 = {0,1,2,3,4,5,6,7,8,9};
    int[] input2Reversed = {9,8,7,6,5,4,3,2,1,0};
    // Test reversed non empty list
    assertArrayEquals(input2Reversed,ArrayExamples.reversed(input2));
  }
  /****************************************************************************/
}
