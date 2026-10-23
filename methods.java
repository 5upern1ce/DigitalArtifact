import java.util.Scanner;

public class methods{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float num1= 0;
        float num2 = 0;
        do{
            System.out.println("Enter your first number: ");
            num1 = sc.nextFloat();

            System.out.println("Enter your second number: ");
            num2 = sc.nextFloat();

        }while(num1==0 || num2 ==0);

        int choice = 0;
        do{
            System.out.println("Please choose from a method \n1.Multipy \n2.Divide \n3.Add \n4.Subtract \n");
            choice = sc.nextInt();
            
            if(choice<1 && choice>4){
            }else{
                switch(choice){
                    case 1:
                        System.out.println("Answer: "+ multiply(num1, num2));
                        break;
                    case 2:
                        System.out.println("Answer: "+ divide(num1, num2));
                        break;
                    case 3:
                        System.out.println("Answer: "+ add(num1, num2));
                        break;
                    case 4:
                        System.out.println("Answer: "+ subtract(num1, num2));
                        break;
                }
            }

        }while(choice<1 && choice>4);
    }

    public static float multiply(float num1, float num2){
        return num1*num2;
    }

    public static float add(float num1, float num2){
        return num1+num2;
    }

    public static float subtract(float num1, float num2){
        return num1-num2;
    }

    public static float divide(float num1, float num2){
        return num1/num2;
    }
}