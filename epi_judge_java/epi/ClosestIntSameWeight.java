package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class ClosestIntSameWeight {
  @EpiTest(testDataFile = "closest_int_same_weight.tsv")
  public static long closestIntSameBitCount(long x) {
    for(int i = 0; i<=61; i++){
      if(((x>>>i)&1)!=((x>>>(i+1))&1)){
        long bitMask = (1L << i) | (1L << (i+1));
        x ^= bitMask;

        return x;
      }
    }
    throw new IllegalArgumentException("모든 비트가 0또는 1로 구성되어있다.");
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "ClosestIntSameWeight.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
