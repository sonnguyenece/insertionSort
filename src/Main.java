public class Main {
    public static void main(String[] args) {
        int[] arrEx1 = {5, 6, 4, 9, 10, 5, 1, 3, 2};
        int[] arrEx2 = {5, 6, 4, 9, 10, 5, 1, 3, 2};

        System.out.println("Array before sort :");
        display(arrEx2);
        System.out.println();

        insertSort(arrEx2);
        System.out.println("Array after sort :");
        display(arrEx2);
        System.out.println();

        System.out.println("Array step sort :");
        insertSortEx1(arrEx1);
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

    static void insertSortEx1(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && temp < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
            display(arr);
        }
    }
    static void display(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

}
