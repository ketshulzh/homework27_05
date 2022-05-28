package Homework27_05;

public class main {
    public static void main(String[] args) {
        //Задан массив, содержащий 20 целых чисел в диапазоне от -20 до 20.
        // Найти сумму элементов этого массива с нечетными номерами.
        /*
        final int size = 20;
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 41) - 20;
            System.out.print(arr[i] + " ");
        }
        for (int i = 1; i < size; i += 2) {
            sum = sum + arr[i];
        }
        System.out.println("\nСумма элементов = " + sum);

         */
        //Задан массив, который содержит 15 целых чисел в диапазоне от -60 до 60.
        // Найти произведение отрицательных элементов массива.
        /*
        final int size = 11;
        int[] arr = new int [size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*121)-60;
            System.out.print(arr[i] + " ");
        }
        int pr = 1;
        for(int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                pr = pr * arr[i];
            }
        }
            System.out.println("\nПроизведение = " + pr); //если проверять и перемножать отрицательные числа, иногда сходится, а иногда нет
*/
        //Задан массив A, содержащий 10 целых чисел. Найти сумму элементов этого массива.
        /*
        final int size = 10;
        int[] arr = new int [size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*11);
            System.out.print(arr[i] + " ");
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            sum = sum + arr[i];
        }
        System.out.println("\n" + sum);
*/
        //Задан массив, который содержит 8 целых чисел. Найти сумму положительных элементов массива.
        /*
        final int size = 8;
        int[] arr = new int [size];
        for (int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*9);
            System.out.print(arr[i] + " ");
        }
        int sum = 0;
        for(int i = 0; i < size; i++){
            if(arr[i]>0) {
                sum = sum + arr[i];
            }
        }
        System.out.println("\nРезультат " + sum);

         */

        //5. Задан массив, который содержит 6 целых чисел. Найти количество элементов массива, которые делятся на 3.
        /*
        final int size = 6;
        int[] arr = new int [size];
        int k = 0;
        for (int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*7);
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < size; i++){
            if (arr[i]%3==0){
                k++;
            }
        }
        System.out.println("\nКоличество элементов " + k);

         */
        // Задан массив из 9 целых чисел. Найти произведение элементов массива, которые являются нечетными числами.
        /*
        final int size = 9;
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = (int)(Math.random()*10);
            System.out.print(arr[i] + " ");
        }
        int pr = 1;
        for(int i = 0; i < size; i++){
            if(arr[i]%2!=0){
                pr = pr*arr[i];
            }
        }
        System.out.println("\nПроизведение = " + pr);

         */
        }
    }
