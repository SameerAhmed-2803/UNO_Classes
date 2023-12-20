
public class ArrayUtil {
    //Problem 1
    public static void reverse(String[] array){
        //set x as the last index of the array
        int x = array.length - 1;
        for(int i = 0; i < x; i++, x--){
            //set temp as the current index
            String temp = array[i];
            //set i to the last index
            array[i] = array[x];
            //set x as the new current index
            array[x] = temp;
        }  
    }
    //Problem 2
    public static String[] resize(String[] array){
        String[] temp = new String[array.length * 2];
        for(int i = 0; i < array.length; i++){
            temp[i] = array[i];
        }
        return temp;
    }
    
    // problem 5
    // First method findMinValue
    public static int findMinValue(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }

    // Second method findMaxValue
    public static int findMaxValue(int[] array) {
        int max = array[0];
        for (int element : array) {
            max = Math.max(element, max);
        }
        return max;
    }

    // Problem 6
    // First method findMinIndex

    public static int[] findMinIndex(int[] array) {
        // find the minimum value in an array
        // Call method from problem 5 and get min value in an array.
        int min = findMinValue(array);
        // count the minimum value in an array
        int count = 0;
        for (int element : array) {
            if (element == min) {
                count++;
            }
        }
        // intialize a resulting array where we can store the indices
        int[] minIdices = new int[count]; // new array of length count
        // get the minimum indices and stores them in the resulting array
        int countMin = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == min) {
                minIdices[countMin++] = i;
            }
        }
        return minIdices;
    }

    // Second method findMaxIndex
    public static int[] findMaxIndex(int[] array) {
        // find max value in an array
        int max = findMaxValue(array);
        // count the occruances of max value in an array
        int count = 0;
        for (int element : array) {
            if (element == max) {
                count++;
            }
        }
        // intiailize resulting array with length of count
        int[] maxIndices = new int[count];
        // get all the max indices from an array
        int countMax = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                // store in resulting array;
                maxIndices[countMax++] = i;
            }
        }
        return maxIndices;
    }
}
