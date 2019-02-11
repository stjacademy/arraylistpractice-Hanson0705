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
		for(int i=0; i<myList.size();i++) {
			System.out.println(myList.get(i));
		}
		System.out.println("**************");
		for(Integer num : myList) {
			System.out.println(num);
		}
	}

}
