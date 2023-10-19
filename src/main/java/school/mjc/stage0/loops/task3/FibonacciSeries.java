package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
       int a = 0;
       int b = 1;
       int c = 0;
       
       while(b <= lastFibonacci) {
           System.out.println(a);
           System.out.println(b); 
           c = a + b;
           a = b + c;
           b = a + c;
           if(c > lastFibonacci) { break; }
           System.out.println(c);
       } 
    }
}
