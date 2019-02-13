import java.util.ArrayList;
public class Notes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <Integer> myList = new ArrayList<Integer>();
		myList.add(42);
		myList.add(24);
		myList.add(507);
		myList.set(1, 52);
		myList.add(1, 43);
		System.out.println(myList.remove(1));
		System.out.println(myList);
		Integer remove = (Integer)myList.remove(myList.size()-1);
		System.out.println(remove);
		}

}
