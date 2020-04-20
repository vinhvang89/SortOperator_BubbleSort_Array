public class BubbleSort {
    public static void main(String[] args) {
        double[] numbers = { 9.5,3,8.1,99,99.9,99.99,12.4,5.1};
        bubbleSort(numbers);
        display(numbers);

    }
     static void bubbleSort(double[] array){
        Double temp;
        for (int i = 0; i < array.length-1 ; i++) {
            for (int j = i+1; j < array.length ; j++) {
                if( array[i] > array[j]){
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
     static void display(double[] array){
        for (int i = 0; i <array.length ; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
