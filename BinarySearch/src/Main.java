public class Main {

    public static void main(String[] args) {

        int[] mass = {1, 12 ,16, 47, 68 , 76, 99};
        int item = 94;
        String result = binarySearch(mass, item);

        System.out.println(result);
    }

    public static String binarySearch(int[] mass, int item) {
        int low = 0;
        int high = mass.length - 1;
        int mid;
        System.out.println("item is " + item);
        String result = "";

        while (low <= high) {
            mid = (high + low)/2;
            System.out.println("low = " + low);
            System.out.println("high = " + high);
            System.out.println("mid is = " + mid);
            int guess = mass[mid];
            System.out.println("guess is " + guess);

            if (guess == item) {
                return result = "guess index is " + mid;
            }

            if (guess > item) {
                high = mid -1;
            } else {
                low = mid + 1;}
            }
        return "No such index for element";
    }
}
