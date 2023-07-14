public class Test{
    public static void main(String[] args){
        long result1 = Ackerman.AFunc(0,0);
        long result2 = Ackerman.AFunc(2,0);
        long result3 = Ackerman.AFunc(3,9);
        if(result1 == 1 && result2 == 3 && result3 == 4093){
            System.out.println("Test Success");
        }else{
            System.out.println("Test failure: ");
            System.out.print("result1: " + result1 + "\n" +
                             "result2: " + result2 + "\n" +
                             "result3: " + result3 + "\n");
        }
    }
}
