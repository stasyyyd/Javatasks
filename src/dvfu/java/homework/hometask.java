package dvfu.java.homework;

import java.io.IOException;

/*Оформить различные сортировки в виде методов) */
public class hometask {
    public static void main(String[] args) throws IOException {
        int[] array = {2, 3, 4, 1,-1,-9};
        selectionSort(array);
        System.out.println("Сортировка выбором");
        for (int a : array) {

            System.out.println(a);

        }
        selectionBubble(array);
        System.out.println("Сортировка пузырьком");
        for (int a : array) {

            System.out.println(a);

        }
        InsertSort(array);
        System.out.println("Сортировка вставками");
        for (int a : array) {

            System.out.println(a);

        }
        sort(array);
        System.out.println("Сортировка по убыванию");
        for (int a : array) {

            System.out.println(a);

        }
    }

  public   static int[] selectionSort(int[] arr) {

      for (int i=0;i<arr.length-1;i++) {
          int num = i;
          for (int j = i + 1; j < arr.length; j++) {
              if (arr[j] < arr[num]) {
                  num = j;
              }
          }
          int tmp = arr[i];
          arr[i] = arr[num];
          arr[num] = tmp;
      }
        return arr;
    }

    public   static int[] selectionBubble(int[] arr) {

     for (int i=0;i<arr.length;i++) {
         int num = arr[i];

         for (int j = i - 1;j>=0;j-- ){
            int num2=arr[j];
            if (num<num2){
                arr[j+i]=num2;
                arr[i]=num;
            }else {
                break;
            }

         }

     }
        return arr;
    }

    public   static int[] InsertSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }
    public   static int[] sort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        return arr;
    }
}