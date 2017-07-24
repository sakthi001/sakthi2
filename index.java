package repeat;

import static java.lang.System.*;
import java.util.Arrays;
import java.util.Scanner;


public class FindIntegerSameAsIndex {

    
    static  int intArray[],iteration;
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(in);
        out.println("Enter no of integers : ");
        integerArray=new int[s.nextInt()];
        for(iteration=0;iterationintArray.length;iteration++){
            out.print("Enter integer with index "+iteration+" : ");
            integerArray[iteration]=s.nextInt();
        }
        findIntegerMatchWithIndex(integerArray);
             }

    private static void findIntegerMatchWithIndex(int[] intArray) {
        for(iteration=0;iteration<intArray.length;iteration++){
            if(iteration==intArray[iteration]){
                out.println("The integer "+intArray[iteration]+" equals its index "+iteration);
            }
        }
    }
        
           }
    
    
