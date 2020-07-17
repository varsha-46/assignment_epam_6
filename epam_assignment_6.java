import java.util.*;
public class example_framework {
   public static void main(String[] args){
	   TreeSet<String> set=new TreeSet<>();
	   //adding elements to the TreeSet
	   set.add("what!");
	   set.add("when?");
	   set.add("why?");
	   set.add("wow!!");
	   set.add("how?");
	   set.add("where?");
	   set.add("which?");
	   set.add("alas!!");
	   set.add("God!");
	   set.add("Yassss!");
	   //resulting TreeSet using Iterator
	   Iterator<String> itr=set.iterator();  
	   while(itr.hasNext()){  
	   System.out.println(itr.next());  
	   }
	   
	   //removing element using remove()
	   set.remove("what!");
	   System.out.println("***after removing an element from treeset****");
	   System.out.println(set);
	   set.remove("how?");
	   System.out.println("***after removing another element from treeset****");
	   System.out.println(set);
	   
	   //headSet() method gives value less than equal to specified element
	   System.out.println("***headSet method gives elements which are less than the given");
       System.out.println(set.headSet("alas!!"));
       
       //tailSet() method gives value greater than equal to specified element
	   System.out.println("***tailSet method gives elements which are greater than the given");
       System.out.println(set.tailSet("how?"));
       
       //size() returns an integer denoting no of elements in the TreeSet
	   System.out.println("***The size of treeset is*** ");
	   System.out.println(set.size());
	   
	   //pollFirst() gives least element
	   System.out.println("***pollfirst method retrieves and removes lowest element");
	   System.out.println(set.pollFirst());

     }
}
