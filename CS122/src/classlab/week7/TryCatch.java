package classlab.week7;

public class TryCatch {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try{
            System.out.println("Line before errorous line");
            System.out.println(1/0);

            System.out.println(arr[11]);
            System.out.println(10/arr[9]);
            System.out.println("Line after errorous line");
        }
        catch(ArithmeticException e){
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.print("Error: ");
            System.out.println(e.getMessage());
        }
        System.out.println("Line outside try-catch");
    }
}
