import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size array :");
        int size = scanner.nextInt();
        int[] arrayInt = new int[size];

        System.out.println("Enter the value :");
        int element = scanner.nextInt();

        System.out.println("Enter the index :");
        int index = scanner.nextInt();

        if(index <= 1 && index >= arrayInt.length -1 )
            System.out.println("Cannot insert element into array");

        arrayInt = InsertElementIntoArray.insertElementIntoArray(arrayInt,index,element);

        for(int array : arrayInt){
            System.out.println(array);
        }
    }
}
