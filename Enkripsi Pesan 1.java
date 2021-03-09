import java.util.Scanner;

public class Main {
    //soal ada di https://www.hackerrank.com/contests/praktikum1-asd-tif-d/challenges/enkripsi-pesan-1
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kata = input.nextLine();
        int area = kata.length();
        String arr[] = new String[area];
        String temp;

        int geser = input.nextInt();
        input.nextLine();
        String hapus = input.nextLine();


        for(int i = 0; i<arr.length; i++){
            arr[i] = kata.substring(i,i+1);
        }

        for (int i=1;i<=geser;i++) {
            temp = arr[0];
            System.arraycopy(arr, 1, arr, 0, arr.length - 1);
            arr[arr.length-1]=temp;
        }


        for(int i = 0; i<arr.length; i++){
            if(!arr[i].equalsIgnoreCase(hapus)){
                System.out.print(arr[i]);
            }
        }

//        for(int i = 0; i<arr.length; i++){
//            System.out.print(arr[i]);
//        }
    }
}
