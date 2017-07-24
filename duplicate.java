package com.java2novice.algos;
import java.util.ArrayList;
import java.util.List;
public class DupNumber {
public int findDupNumber(List<Integer> numbers){
int highestNumber = numbers.size() - 1;
int total = getSum(numbers);
int dup = total - (highestNumber*(highestNumber+1)/2);
return dup;
}
public int getSum(List<Integer> numbers){
int sum = 0;
for(int num:numbers){
sum += num;
}
return sum;
}
public static void main(String a[]){
List<Integer> numbers = new ArrayList<Integer>();
for(int i=1;i<30;i++){
numbers.add(i);
}
//add dup number into the list
numbers.add(22);
DupNumber dn = new DupNumber();
System.out.println("Dup Number: "+dn.findDupNumber(numbers));
}
}
