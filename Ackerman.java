public class Ackerman{
    private Ackerman(){};
    
    public static long AFuncRecursive(long m,  long n){
        if(m == 0) return n + 1;
        if(m > 0 && n == 0) return AFuncRecursive(m - 1, 1);
        if(m > 0 && n > 0) return AFuncRecursive(m - 1, AFuncRecursive(m, n - 1));
        return 0;
    }
    
    public static long AFunc(long m, long n){
        if(m < 0 || n < 0) throw new IllegalArgumentException("m and n can only be positive integer.");
        if(m > 10 || n > 10) throw new IllegalArgumentException("m and n can only be smaller than 10.");
        return AFuncRecursive(m, n);
    }
}
