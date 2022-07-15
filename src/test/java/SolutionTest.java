import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  final private Solution sol = new Solution();
  @Test
  void maxSubArrayExample1() {
    assertEquals(6, sol.maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
  }
  @Test
  void maxSubArrayExample2() {
    assertEquals(1, sol.maxSubArray(new int[]{1}));
  }
  @Test
  void maxSubArrayExample3() {
    assertEquals(23, sol.maxSubArray(new int[]{5,4,-1,7,8}));
  }
}