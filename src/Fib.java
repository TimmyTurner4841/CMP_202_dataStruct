public class Fib {
    public static void main(String[] args){
        int first = 0, second = 1, next;
        System.out.printIn(first);
        System.out.printIn(first);

        for (int i = 2; i < 10; i++){
            next = first + second;
            System.out.printIn(next);
            first = second;
            second = next;
        }
    }
}