import java.util.Scanner;

public class Main {
    public static int[] insertElement(int[]array, int insertValue, int insertIndex){
        int [] newArray = new int [array.length+1];

            for(int i=0; i<newArray.length;i++){
                if(i==insertIndex){
                    newArray[i]=insertValue;
                }else if(i<insertIndex){
                    newArray[i]=array[i];
                }else{
                    newArray[i]=array[i-1];
                }
            }

        return newArray;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size= input.nextInt();
        int[] array= new int[size];
        System.out.println("Enter Array's element! ");
        for(int i=0;i<array.length;i++){
            System.out.print("Element ["+ i +"]: " );
            array[i]=input.nextInt();
        }
        System.out.print(" Enter value insert to array: ");
        int insertValue=input.nextInt();
        System.out.print(" Enter index insert to array: ");
        int insertIndex = input.nextInt();
        int [] newArray= insertElement(array,insertValue,insertIndex);
        //for each khac for thuong o cho: khi in "i" se in ra gia tri cua phan tu tai vi tri i
        for (int i:newArray){
            System.out.println(i+" ");
        }
    }

}
