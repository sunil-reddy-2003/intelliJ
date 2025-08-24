package OOPS.exceptionHandling;

public class MyException extends Exception{
    public MyException(String message){
        super(message);
    }

    public static void main(String[] args) throws Exception {
        String name="sunil";
        try{
            if(name.equals("sunil")){
                throw new MyException("name is sunil");
            }
        }
//        catch (MyException e) {
//            throw new Exception(e.getMessage());
//        }
        catch (MyException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

    }
}
