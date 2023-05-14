package by.shurmeleva.Lesson11;

public class ExceptionExample {
    public static void main(String[] args) {
        int result = 0;
        try {
            result = 2/1;
            try {
                result = 2 / 0;
            }catch (Exception e) {
            }
        } catch (ArithmeticException  | IndexOutOfBoundsException e) {
            System.out.println("Oops, something bad");
            result = 0;
            //result = 0; //или вверху result равен 0 или в catch равен 0
        }catch (Exception e) {
            System.out.println("Oops, something bad 2");
            result = -1;
        }finally {
            System.out.println("this is the end of try block!");
        }
        System.out.println(result);
    }
}
