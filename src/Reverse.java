import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        int[]array={1,3,5,7};
        int[] newArray=reverse(array);
        for (int a: newArray) {
            System.out.println(a);
        }
    }
    public static int[] reverse(int[] array){
        Stack<Integer> reverse=new Stack<Integer>();
        for (int i = 0; i < array.length; i++) {
            reverse.push(array[i]);
        }
        int[] newArray=new int[array.length];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i]=reverse.pop();
        }
        return newArray;
    }
}

