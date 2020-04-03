import java.util.Scanner;

public class MAX_MIN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int arr[] = new int[5];
        int MAX = arr[0];
        int MIN = arr[0];
        System.out.println("Give 5 Numbers : ");
        for (int i=0;i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        for (int i=0;i<arr.length;i++){
                if (MAX<arr[i]){
                    MAX=arr[i];
                }
               else if (MIN>arr[i]){
                    MIN=arr[i];
                }
            }
        System.out.println("Maximum number = "
                + MAX + " Minimum number = " + MIN);
        }
    }
