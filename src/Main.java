import java.util.Scanner;

public class Main {
  public static   class IllegalTriangleException extends Exception {
        public IllegalTriangleException(String errorMessage) {
            super(errorMessage);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a:");
        int a = scanner.nextInt();
        System.out.println("Nhập vào cạnh b:");
        int b = scanner.nextInt();
        System.out.println("nhập vào cạnh c:");
        int c = scanner.nextInt();
        try{
            if (a<=0||b<=0||c<=0||(a+b)<c||(a+c)<b||(b+c)<a){
                throw new IllegalTriangleException("không phải là tam giác");
            }else {
                System.out.println("là tam giác");
            }
        }catch (IllegalTriangleException e){
            System.err.println(e.getMessage());
        }
    }
}
