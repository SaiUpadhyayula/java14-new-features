public class PatternMatchingDemo {

    public static void main(String[] args){
        Object obj = "Java 14 is Here";

        if(obj instanceof String s){
            System.out.println(s.toUpperCase());
        }


    }
}
