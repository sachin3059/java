import java.util.*;

public class Demo{
    public static void main(String[] args){
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 10; i++){
            int x = sc.nextInt();
            arr.add(x);
        }

        for(int it: arr){
            System.out.print(it + " ");
        }
        System.out.println();

        // update array element
        arr.set(2, 334);
        for(int it: arr){
            System.out.print(it + " ");
        }

    }
}