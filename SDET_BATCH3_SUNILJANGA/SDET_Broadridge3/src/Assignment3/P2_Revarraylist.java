package Assignment3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P2_Revarraylist {
	
	public static void main(String[] args)
    {
        List<String>  mylist = new ArrayList<String>();
        mylist.add("Cloud");
        mylist.add("AI");
        mylist.add("BlockChain");
        mylist.add("Digital");
  
        System.out.println("Original List : " + mylist);

        Collections.reverse(mylist);
  
        System.out.println("Modified List: " + mylist);

}
}
