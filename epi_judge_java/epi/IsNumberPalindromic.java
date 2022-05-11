package epi;
import epi.test_framework.EpiTest;
import epi.test_framework.GenericTest;
public class IsNumberPalindromic {
  @EpiTest(testDataFile = "is_number_palindromic.tsv")
  public static boolean isPalindromeNumber(int x) {   // 7915
    if(x<0)
      return false;

    int numDigits = (int)(Math.floor(Math.log10(x)))+1;   // 4
    int mask = (int) Math.pow(10,numDigits-1);            // 10^3 = 1000
    for(int i=0; i<numDigits/2; i++){
      int top = x/ mask;
      int bottom = x%10;
      if(top!=bottom)
        return false;
      x = (x%mask)/10;
      mask /=100;
    }

    return true;
  }

  public static void main(String[] args) {
    System.exit(
        GenericTest
            .runFromAnnotations(args, "IsNumberPalindromic.java",
                                new Object() {}.getClass().getEnclosingClass())
            .ordinal());
  }
}
