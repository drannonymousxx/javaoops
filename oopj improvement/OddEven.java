package oopj improvement;

public import java.util.Scanner;
class OddEven{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int odd = 0;
        int even = 0;
        System.out.println("Enter 10 numbers: ");
        for(int i=1;i<=10;i++){
            int num = sc.nextInt();
            if(num % 2 == 0){
            System.out.println("Number is even");
            even++;
            }
            else{
                System.out.println("Number is odd");
            odd++;
            }
        }
        System.out.println("Even numbers are: "  + even);
        System.out.println("Odd numbers are: " + odd);
       
        sc.close();
    }
} {
    
}
