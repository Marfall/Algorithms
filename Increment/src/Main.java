public class Main  {
    public static void main(String[] args) {

        int result = incrementFuck(5);

        System.out.println(result);
    }

    public static int  incrementFuck(int number) {

        int x = number;
        System.out.println("x= " + x);
        int result =  x-- + ++x + x++ - --x - --x + x--;
        System.out.println("result " + result);
        // 5 + 5  + 5- 5 -4 + 4
        return result;
    }
}
