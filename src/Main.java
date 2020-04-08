public class Main {
    public static void main(String[] args) {
        int[] arr = {5, 6, 4, 9, 10, 5, 1, 3, 2};
        insertSort(arr);
        display(arr);
    }

    static void insertSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
