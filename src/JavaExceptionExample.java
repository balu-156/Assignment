//public class JavaExceptionExample {
//    public static void main(String[] args) {
//        try {
//        int data = 100 / 0;
//    }catch (ArithmeticException e)
//        {System.out.println(e);}
//        System.out.println("code ends");
//    }
//}



//public class JavaExceptionExample {
//public static void main(String[] args) {
//        int data=100/1;
//        System.out.println("code ends");
//    }
//}

//public class JavaExceptionExample {
//    public static void main(String[] args) {
//        try {
//            String S=null;
//            System.out.println(S.length());
//        }
//        catch (Exception e) {
//            System.out.println(e);
//        }
//        System.out.println("rest of the code");
//
//    }
//}

//public class JavaExceptionExample{
//
//    public static void main(String[] args) {
//
//        try{
//            int a[]=new int[5];
//            a[5]=30/0;
//        }
//        catch(ArithmeticException e)
//        {
//            System.out.println("Arithmetic Exception occurs");
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            System.out.println("ArrayIndexOutOfBounds Exception occurs");
//        }
//        catch(Exception e)
//        {
//            System.out.println("Parent Exception occurs");
//        }
//        System.out.println("rest of the code");
//    }
//}

//public class JavaExceptionExample {
//    public static void main(String[] args) {
//        try {
//            try {
//                System.out.println("GOING TO DIVIDE BY 0");
//                int b = 39 / 0;
//            } catch (ArithmeticException e) {
//                System.out.println(e);
//            }
//            try {
//                int a[] = new int[5];
//                a[5] = 4;
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println(e);
//            }
//            System.out.println("OTHER STATEMENT");
//        } catch (Exception e) {
//            System.out.println("HANDLED THE Exception(OUTER CATCH)");
//        }
//        System.out.println("NORMAL FLOW..");
//    }
//    }

//class TestFinallyBlock {
//    public static void main(String args[]){
//        try{
////below code do not throw any exception
//            int data=25/5;
//            System.out.println(data);
//        }
////catch won't be executed
//        catch(NullPointerException e){
//            System.out.println(e);
//        }
////executed regardless of exception occurred or not
//        finally {
//            System.out.println("finally block is always executed");
//        }
//
//        System.out.println("rest of phe code...");
//    }
//}

//public class JavaExceptionExample {
//    public static void validate(int age) {
//        if(age<19){
//            throw new ArithmeticException("person is not eligible to vote");
//
//        }
//        else {
//            System.out.println("person is eligible to vote");
//        }
//        }
//
//    public static void main(String[] args) {
//        validate(20);
//        System.out.println("REST OF THE CODE...");
//    }
//
//    }

//import javax.management.MBeanAttributeInfo;
//import java.io.*;
//public class JavaExceptionExample {
//    public static void method()throws FileNotFoundException {
//        FileReader file = new FileReader("C:\\Users\\Anurati\\Desktop\\abc.txt");
//        BufferedReader fileinput = new BufferedReader(file);
//        throw new FileNotFoundException();
//    }
//
//    public static void main(String[] args) {
//        try {
//            method();
//    }
//        catch (FileNotFoundException e)
//        {
//            e.printStackTrace();
//        }
//        System.out.println("REST OF THE CODE...");
//    }
//}

//class TestExceptionPropagation1{
//    Void m() {
//        int data = 50/0;
//        return null;
//    }
//    void n(){
//        m();
//    }
//    void p(){
//        try {
//            n();
//        }
//        catch (Exception e)
//        {System.out.println("Exception handled");}
//    }
//
//    public static void main(String[] args) {
//        TestExceptionPropagation1 obj=new TestExceptionPropagation1();
//        obj.p();
//        System.out.println("NORMAL FLOW....");
//
//    }
//}




