import java.util.Scanner;
public class EquilibriumIndexOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array element : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the array Element : ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int i=1;
        int ans=0;
        while(i<size){
            if((size==1)||(size==2)){
                break;
            }
            else {
                if(i==size-1){
                    break;
                }
                if(i>=1) {
                    int a=0;
                    int b=0;
                    for (int j = 0; j < i; j++) {
                        a = a + arr[j];
                    }
                    for (int j = i + 1; j < size - 1; j++) {
                        b = b + arr[j];
                    }
                    if (a == b) {
                        System.out.println(i);
                        ans = 1;
                        break;
                    }
                }
            }
            i++;
        }
        if(ans==0){
            System.out.println("-1");
        }
    }
}
