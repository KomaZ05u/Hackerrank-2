import java.util.Scanner;

public class Main {
    //soal ada di https://www.hackerrank.com/contests/praktikum1-asd-tif-d/challenges/lompatan-bernilai

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int area = input.nextInt();
        int lompatan = input.nextInt();

        int index = 0;
        int arr[] = new int[area];
        int nilai = 1;
        int poin = 0;
        int gatau=0;
        
        while(gatau<1){
            index = index+lompatan;
            if(index<arr.length){
                if(arr[index]==0){
                    arr[index]=nilai;
                    nilai++;
                }else{
                    gatau=1;
                }
            }else{
                index=index-arr.length;
                if(arr[index]==0){
                    arr[index]=nilai;
                    nilai++;
                }else{
                    gatau=1;
                }
            }
        }
//        System.out.println(arr.length);
        for(int i = 0 ; i<arr.length ; i++){
            poin = poin + arr[i];
        }
        System.out.println(poin);
    }
}
