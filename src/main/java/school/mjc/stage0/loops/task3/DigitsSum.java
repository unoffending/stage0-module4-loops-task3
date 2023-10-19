package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
        String a = Integer.toString(t);
        int l = a.length();
        int result = 0;
        int remainder;
        for(int i = l; i > 0; i--) {
            remainder = t % 10;
            result = result + remainder;
            t = t / 10;
        }
        System.out.println(result);
    }
}
