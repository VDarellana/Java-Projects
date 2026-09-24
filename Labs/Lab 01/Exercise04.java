import java.util.Arrays;
public class Exercise04 {
         private int[] numbers = {1,2,3,4,5};

         public void viewElement(int pos){
            if (pos < 0 || pos >= numbers.length){
                System.out.println("Invalid index");
            } else {
                System.out.println(numbers[pos]);
            }
         }

         public void updateElement(int pos, int newValue){
            if (pos < 0 || pos >= numbers.length){
                System.out.println("Invalid index");
            } else {
                numbers[pos] = newValue;
            }
         }

         public void displayArray(){
            System.out.println(Arrays.toString(numbers));
         }

         public static void main(String[] args) {
            Exercise04 arr = new Exercise04();
            arr.displayArray();
            arr.updateElement(2, 20);
            arr.viewElement(3);
            arr.displayArray();
         }
}
