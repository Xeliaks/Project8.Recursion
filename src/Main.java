
public class Main {

    /*Part1.1 Create recursive function,
             which accept integer argument n and perform such output 9 8 7 6 5 4 3 2 1 when n=9
    */
    public static void countdown(int n) {
        if (n == 0) {
            System.out.println();
        } else {
            System.out.print(n + " ");
            countdown(n - 1);
        }
    }
    /*Part1.2 Create recursive function,
          which accept integer argument n and perform such output 1 2 3 4 5 6 7 8 9 when n=9
    */
    public static void countUp(int n) {
        if (n == 0) {
            System.out.println();
        } else {
            countUp(n - 1);
            System.out.print(n + " ");
        }

    }
    /*Part1.3 Create recursive method without base case and
         demonstrate StackOverflowError (add a screenshot or the console).
    */
    /*public static void error(int n) {

            error(n - 1);
            System.out.print(n + " ");
        }

     */
    //Part2.1 Create recursive function for printing array elements.
    private static void printArray(int[] array, int i) {
        if (i != -1){
            printArray(array,i-1);
            System.out.print(array[i] + " ");
        }
    }
    //Part2.2 Create recursive function to calculate a sum of array elements.
    public static int arraySum(int[] array, int i){
        if (i <= 0)
            return 0;
        return arraySum(array, i - 1) + array[i - 1];
    }
    /*Part2.3 Create recursive function to find how many elements of an array are equal to a given value.
              Pass the given value as an argument.
    */
    public static int findCountInArray(int[] array, int what,int i){
        if (i == -1){
            return 0;
        }
        if (array[i] == what){
            return 1+findCountInArray(array,what,i-1);
        }
        else return findCountInArray(array,what,i-1);
    }

    public static void main(String[] args) {
        countdown(9);
        countUp(9);
        //error(10);
        int[] array = new int[]{1,1,2,3,5};
        System.out.println();
        printArray(array, array.length-1);
        int sum = arraySum(array, array.length);
        System.out.println();
        System.out.println("Sum of array elements equals: " + sum);
        int count = findCountInArray(array,1,array.length-1);
        System.out.println("Number of elements in array equal to 1: " + count);
    }
}