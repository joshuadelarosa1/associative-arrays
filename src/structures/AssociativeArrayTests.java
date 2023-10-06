package structures;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

/**
 * Tests of the AssociativeArray class.
 *
 * @author CSC-207 2023Fa
 */
public class AssociativeArrayTests {


  // +--------------------------+------------------------------------
  // | Tests by Joshua Delarosa |
  // +--------------------------+

  /*
   * Testing what happens if you try to set a value that has previously been set
   */
  @Test
  public void joshuaDelarosaTest1() throws KeyNotFoundException {
    AssociativeArray<String, String> testAA = new AssociativeArray<String, String>();

    testAA.set("fruit", "apple");
    testAA.set("color", "blue");
    testAA.set("animal", "giraffe");

    testAA.remove("animal");

    testAA.set("fruit", "banana");

    assertEquals("banana", testAA.get("fruit"));
  }

  /*
   * Testing that the size and hasKey functions work correctly
   */
  @Test
  public void joshuaDelarosaTest2() {

    AssociativeArray<String, String> testAA = new AssociativeArray<String, String>();

    testAA.set("fruit", "apple");
    testAA.set("color", "blue");
    testAA.set("animal", "giraffe");

    assertEquals(3, testAA.size);

    testAA.remove("animal");
    assertEquals(2, testAA.size);

    assertEquals(true, testAA.hasKey("fruit"));
    assertEquals(false, testAA.hasKey("animal"));
  }

  /*
   * Testing what happens if try to clone the same thing multiple times
   */
  @Test
  public void joshuaDelarosaEdge1() throws KeyNotFoundException {

    AssociativeArray<String, String> testAA = new AssociativeArray<String, String>();

    testAA.set("animal", "shark");

    AssociativeArray<String, String> testAAClone = testAA.clone();
    AssociativeArray<String, String> testAAClone2 = testAAClone.clone();
    AssociativeArray<String, String> testAAClone3 = testAAClone2.clone();
    AssociativeArray<String, String> testAAClone4 = testAAClone3.clone();

    assertEquals("shark", testAAClone4.get("animal"));

  }
}
