package by.shurmeleva.lesson8;

public class MainExample {
    public static void main(String[] args) {
        Parent badParent = new Child();
        final int myInt = 5;
        badParent.setName("Tom");
        System.out.println(badParent.getName());
        //то что ниже, так делается документация
        /**
         * this method return Child if I ask him
         */
        BadParent superBadParent = new BadParent();
        Personable personable = new BadParent();

       //  public static Parent getParent(boolean isParent) {
           //  if (isParent) {
                 //return new Parent("a");
            // }else {
                 //return getParent(true);
             }
        }
       // public static int fib(int param) {
   // if (param == 0 || param == 1) return 1;
    //return fib(param - 1) + fib(param - 2);
       // }

   // }
//}
