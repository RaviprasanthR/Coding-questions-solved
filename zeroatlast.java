/*1.Zero at Last
Problem Statement:
				 You are given an array of integers with size n .you have to form an array such that all zeros present in array will locate to the last.(move zeros to end of array)
Input format:
First line contain size of array 
Second line contain array of elements with separate by space

Output format:
print array of integers such that zeros are at last

sample input:
10
8 0 4 0 2 0 1 3 55 1005

Sample output:
8 4 2 1 3 55 1005 0 0 0*/


class moveZero{
    void move(int arr[]){ //function to move the zeros in the array to the end
        int cnt=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[cnt]=arr[i]; //if the value is not zero, it will be stored at position cnt
                cnt++;
            }
            
        }
        for(int j=cnt;j<arr.length;j++){
                arr[j]=0; //the zeros left are appended to array arr
            }
    }
    void printans(int[] arr){ //function to print the array
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]); //the arr is printed with values separeted be space
        }
    }
}

public class zeroatlast{
    public static void main(String[] args){
        int[] arr={1,0,3,2,0,5,6,0,3};
        moveZero obj=new moveZero();
        obj.move(arr);
        obj.printans(arr);
    }
}