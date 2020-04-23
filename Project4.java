import java.util.Scanner;
public class Project4 {
    public static boolean equals(int[] array1, int[] array2){       //equal method determines if list1 and list 2 are the same 
        for(int i = 0;i<array1.length;i++){				//tests all values on the array 0 - list 1 length 
            if(array1[i]!=array2[i]){				//tests each value comparing list 1 and list 2
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int array1[] = new int[5]; 			
        int array2[] = new int[5];

        System.out.print("Enter 5 elements of list1: "); //prompts user
        for(int i = 0;i<5;i++){   		//loop repeats as many times as its size value 
            array1[i] = scanner.nextInt();  
        }

        System.out.print("Enter 5 elements of list2: ");
        for(int i = 0;i<5;i++){
            array2[i] = scanner.nextInt();
        }

        if(equals(array1,array2)){				//if/else statement 
            System.out.println("Two lists are strictly identical."); //returns result if true
        }
        else{
            System.out.println("Two lists are not strictly identical.");  //returns result if false
        }
    }
}