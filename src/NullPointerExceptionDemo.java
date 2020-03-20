public class NullPointerExceptionDemo {

    public static void main(String[] args){

        String a = null;
        String b = a.toUpperCase();
        System.out.println(b);
    }
}
