public class InsertElementIntoArray {
    public static int[] insertElementIntoArray(int[] array, int index, int element){
        int length = array.length;
        int[] newArray = new int[length + 1];
        System.arraycopy(array,0, newArray,0,index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray,index +1,length - index);
        return newArray;
    }
}
