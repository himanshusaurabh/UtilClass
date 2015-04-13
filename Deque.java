import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeDemo {
   public static void main(String[] args) {
      
      // create an empty array deque with an initial capacity
      Deque<Integer> deque = new ArrayDeque<Integer>(8);

      // use add() method to add elements in the deque
      deque.add(25);
      deque.add(30);
      deque.add(20);
      deque.add(18);        
           
      boolean retval = deque.isEmpty();
      if (retval == true) {
         System.out.println("deque is empty");
       }
      else {
         System.out.println("deque is not empty");
       }
	   
      // printing all the elements available in deque
      for (Integer number : deque) {
         System.out.println("Number = " + number);
      }
   }
}

//Answer is
//deque is not empty
//Number = 25
//Number = 30
//Number = 20
//Number = 18
