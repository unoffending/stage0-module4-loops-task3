package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
         String a = Integer.toString(lengthOfLastNumber);
         int l = a.length();
         int nines = 9;
         int result2 = 0;
         int s;
         for(int i = l; i > 0; i--) {
             s = nines * l;
             l--;
             nines *= 10;
             result2 += s;
         } 
         System.out.println(result2);
    }
}
