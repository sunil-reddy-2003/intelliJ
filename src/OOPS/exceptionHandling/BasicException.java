package OOPS.exceptionHandling;

public class BasicException extends Exception{
    public static void main(String[] args) {
        int a=9;
        int b=0;
        try {
//            divide(a, b);
            throw new Exception("just for fun");
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println("Normal Exception");
        }finally {
            System.out.println("this block is always executed");
        }

    }

    static int divide(int a, int b) throws Exception{
        if(b==0){
            throw new ArithmeticException("denominator can't be zero");
        }
        return (a/b);
    }


}
